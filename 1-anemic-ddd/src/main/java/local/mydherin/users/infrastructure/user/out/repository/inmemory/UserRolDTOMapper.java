package local.mydherin.users.infrastructure.user.out.repository.inmemory;

import local.mydherin.users.infrastructure.shared.daos.usercore.RolDTO;
import local.mydherin.users.infrastructure.user.out.entities.rol.UserRolDTO;
import org.springframework.stereotype.Service;

@Service("InMemoryUserRolDTOMapper")
public class UserRolDTOMapper {

    public UserRolDTO from(final RolDTO rolDTO) {
        return UserRolDTO.of(rolDTO.getId(), rolDTO.getName());
    }

}
