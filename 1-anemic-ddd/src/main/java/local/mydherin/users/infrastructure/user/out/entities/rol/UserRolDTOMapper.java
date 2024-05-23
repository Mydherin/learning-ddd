package local.mydherin.users.infrastructure.user.out.entities.rol;

import local.mydherin.users.domain.user.entities.rol.Rol;
import local.mydherin.users.domain.user.entities.rol.vos.Name;
import local.mydherin.users.domain.user.entities.rol.vos.RolId;
import org.springframework.stereotype.Service;

@Service
public class UserRolDTOMapper {
    public Rol toDomain(final UserRolDTO userRolDTO) {
        final var id = RolId.of(userRolDTO.getId());
        final var name = Name.of(userRolDTO.getName());
        return Rol.of(id, name);
    }
} 
