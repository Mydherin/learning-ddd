package local.mydherin.users.infrastructure.rol.in;

import local.mydherin.users.domain.rol.Rol;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ControllerRolDTOMapper")
public class RolDTOMapper {
    public RolDTO fromDomain(final Rol rol) {
        return RolDTO.of(
                rol.getId().getValue(),
                rol.getName().getValue()
        );
    }

    public List<RolDTO> fromDomain(final List<Rol> rol) {
        return rol.stream()
                .map(this::fromDomain)
                .toList();
    }
} 
