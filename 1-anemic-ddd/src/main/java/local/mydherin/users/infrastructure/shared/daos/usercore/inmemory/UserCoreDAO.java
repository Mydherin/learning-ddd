package local.mydherin.users.infrastructure.shared.daos.usercore.inmemory;

import local.mydherin.users.infrastructure.shared.daos.usercore.RolDTO;
import local.mydherin.users.infrastructure.shared.daos.usercore.UserCoreDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserCoreDAO {

    public List<UserCoreDTO> findAll() {
        return List.of(
                UserCoreDTO.of(
                        "1", "1N", RolDTO.of("1", "Admin")),
                UserCoreDTO.of(
                        "2", "1R", RolDTO.of("2", "Tonto")),
                UserCoreDTO.of(
                        "3", "2L", RolDTO.of("2", "Tonto")));
    }
}
