package local.mydherin.users.infrastructure.user.out;

import local.mydherin.users.domain.user.User;
import local.mydherin.users.domain.user.vos.Age;
import local.mydherin.users.domain.user.vos.DNI;
import local.mydherin.users.domain.user.vos.Name;
import local.mydherin.users.domain.user.vos.UserId;
import local.mydherin.users.infrastructure.rol.out.RolDTOMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDTOMapper {

    private final RolDTOMapper rolMapper;

    public UserDTOMapper(final RolDTOMapper rolMapper) {
        this.rolMapper = rolMapper;
    }

    public User toDomain(final UserDTO userDTO) {
        final var id = UserId.of(userDTO.getId());
        final var name = Name.of(userDTO.getName());
        final var age = Age.of(userDTO.getAge());
        final var dni = DNI.of(userDTO.getDNI());
        final var rol = this.rolMapper.toDomain(userDTO.getRolDTO());
        return User.of(id, name, age, dni, rol);
    }

    public List<User> toDomain(final List<UserDTO> userDTOCollection) {
        return userDTOCollection.stream()
                .map(this::toDomain)
                .toList();
    }
} 
