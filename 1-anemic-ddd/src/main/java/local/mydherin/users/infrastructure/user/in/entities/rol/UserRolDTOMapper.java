package local.mydherin.users.infrastructure.user.in.entities.rol;

import local.mydherin.users.domain.user.entities.rol.Rol;
import org.springframework.stereotype.Service;

@Service("ControllerUserRolDTOMapper")
public class UserRolDTOMapper {
    public UserRolDTO fromDomain(final Rol rol) {
        return UserRolDTO.of(
                rol.getId().getValue(),
                rol.getName().getValue()
        );
    }
} 
