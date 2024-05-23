package local.mydherin.users.infrastructure.user.in;

import local.mydherin.users.domain.user.User;
import local.mydherin.users.infrastructure.user.in.entities.rol.UserRolDTOMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ControllerUserDTOMapper")
public class UserDTOMapper {
    private final UserRolDTOMapper rolMapper;

    public UserDTOMapper(UserRolDTOMapper rolMapper) {
        this.rolMapper = rolMapper;
    }

    public UserDTO fromDomain(final User user) {
        return UserDTO.of(
                user.getId().getValue(),
                user.getName().getValue(),
                user.getAge().getValue(),
                user.getDni().getValue(),
                this.rolMapper.fromDomain(user.getRol())
        );
    }

    public List<UserDTO> fromDomain(final List<User> userCollection) {
        return userCollection.stream()
                .map(this::fromDomain)
                .toList();
    }
} 
