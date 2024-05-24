package local.mydherin.users.infrastructure.rol.out;

import local.mydherin.users.domain.rol.Rol;
import local.mydherin.users.domain.rol.vos.Name;
import local.mydherin.users.domain.rol.vos.RolId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolDTOMapper {
    public Rol toDomain(final RolDTO rolDTO) {
        final var id = RolId.of(rolDTO.getId());
        final var name = Name.of(rolDTO.getName());
        return Rol.of(id, name);
    }

    public List<Rol> toDomain(final List<RolDTO> rolDTO) {
        return rolDTO.stream().map(this::toDomain).toList();
    }
} 
