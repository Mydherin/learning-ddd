package local.mydherin.users.infrastructure.shared.daos.usercore.inmemory;

import local.mydherin.users.infrastructure.shared.daos.usercore.UserCoreDTO;
import local.mydherin.users.infrastructure.shared.daos.usercore.entities.UserCoreRolDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserCoreDAO {

    public List<UserCoreDTO> findAll() {
        return List.of(
                UserCoreDTO.of(
                        "1", "1N", UserCoreRolDTO.of("1", "Admin")),
                UserCoreDTO.of(
                        "2", "1R", UserCoreRolDTO.of("2", "Tontorron")),
                UserCoreDTO.of(
                        "3", "2L", UserCoreRolDTO.of("2", "Tontorron")));
    }
}
