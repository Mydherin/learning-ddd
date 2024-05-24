package local.mydherin.users.infrastructure.rol.out.repository.inmemory;

import local.mydherin.users.infrastructure.rol.out.RolDTO;
import local.mydherin.users.infrastructure.shared.daos.usercore.entities.UserCoreRolDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("InMemoryUserRolDTOMapper")
public class RolDTOMapper {

    public RolDTO from(final UserCoreRolDTO userCoreRolDTO) {
        return RolDTO.of(userCoreRolDTO.getId(), userCoreRolDTO.getName());
    }

    public List<RolDTO> from(final List<UserCoreRolDTO> userCoreRolDTO) {
        return userCoreRolDTO.stream().map(this::from).toList();
    }

}
