package local.mydherin.users.infrastructure.shared.daos.username.inmemory;

import local.mydherin.users.infrastructure.shared.daos.username.UserNameDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserNameDAO {

    public List<UserNameDTO> findAll() {
        return List.of(
                UserNameDTO.of("1", "20"),
                UserNameDTO.of("2", "21"),
                UserNameDTO.of("3", "22")
        );
    }
}
