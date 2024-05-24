package local.mydherin.users.infrastructure.user.out.repository.inmemory;

import local.mydherin.users.application.user.repository.UserCriteria;
import local.mydherin.users.application.user.repository.UserRepository;
import local.mydherin.users.domain.user.User;
import local.mydherin.users.infrastructure.rol.out.repository.inmemory.RolDTOMapper;
import local.mydherin.users.infrastructure.shared.daos.userage.UserAgeDTO;
import local.mydherin.users.infrastructure.shared.daos.userage.inmemory.UserAgeDAO;
import local.mydherin.users.infrastructure.shared.daos.usercore.UserCoreDTO;
import local.mydherin.users.infrastructure.shared.daos.usercore.inmemory.UserCoreDAO;
import local.mydherin.users.infrastructure.shared.daos.username.UserNameDTO;
import local.mydherin.users.infrastructure.shared.daos.username.inmemory.UserNameDAO;
import local.mydherin.users.infrastructure.user.out.UserDTO;
import local.mydherin.users.infrastructure.user.out.UserDTOMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryUserRepository implements UserRepository {

    private final UserNameDAO userNameDAO;
    private final UserAgeDAO userAgeDAO;
    private final UserCoreDAO userCoreDAO;
    private final UserDTOMapper mapper;
    private final RolDTOMapper rolMapper;

    public InMemoryUserRepository(
            UserNameDAO userNameDAO,
            UserAgeDAO userAgeDAO,
            UserCoreDAO userCoreDAO,
            UserDTOMapper mapper,
            RolDTOMapper rolMapper) {
        this.userNameDAO = userNameDAO;
        this.userAgeDAO = userAgeDAO;
        this.userCoreDAO = userCoreDAO;
        this.mapper = mapper;
        this.rolMapper = rolMapper;
    }

    @Override
    public List<User> findBy(final UserCriteria criteria) {
        final var userNameCollection = userNameDAO.findAll();
        final var userAgeCollection = userAgeDAO.findAll();
        final var userCoreCollection = userCoreDAO.findAll();
        final var userCollection = this.join(userNameCollection, userAgeCollection, userCoreCollection);
        return mapper.toDomain(userCollection);
    }

    private List<UserDTO> join(List<UserNameDTO> userNameCollection,
                               List<UserAgeDTO> userAgeCollection,
                               List<UserCoreDTO> userCoreDTOCollection) {
        final List<UserDTO> userColletion = new ArrayList<>();
        userNameCollection.forEach(userName -> {
            for (UserAgeDTO age : userAgeCollection) {
                for (UserCoreDTO userCore : userCoreDTOCollection) {
                    if (userName.getId().equals(userCore.getId()) && userName.getId().equals(age.getId())) {
                        userColletion.add(UserDTO.of(
                                userName.getId(),
                                userName.getName(),
                                age.getAge(),
                                userCore.getDni(),
                                this.rolMapper.from(userCore.getRol())));
                    }
                }
            }
        });
        return userColletion;
    }
}
