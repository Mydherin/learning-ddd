package local.mydherin.users.infrastructure.rol.out.repository.inmemory;

import local.mydherin.users.application.rol.repository.RolRepository;
import local.mydherin.users.domain.rol.Rol;
import local.mydherin.users.infrastructure.shared.daos.usercore.UserCoreDTO;
import local.mydherin.users.infrastructure.shared.daos.usercore.inmemory.UserCoreDAO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InMemoryRolRepository implements RolRepository {

    private final UserCoreDAO dao;
    private final RolDTOMapper daoMapper;
    private final local.mydherin.users.infrastructure.rol.out.RolDTOMapper mapper;

    public InMemoryRolRepository(UserCoreDAO dao, RolDTOMapper daoMapper, local.mydherin.users.infrastructure.rol.out.RolDTOMapper mapper) {
        this.dao = dao;
        this.daoMapper = daoMapper;
        this.mapper = mapper;
    }

    @Override
    public List<Rol> findAll() {
        final var userCoreCollection = dao.findAll();
        final var rolCollection = userCoreCollection.stream().map(UserCoreDTO::getRol).distinct().toList();
        return this.mapper.toDomain(this.daoMapper.from(rolCollection));
    }
}
