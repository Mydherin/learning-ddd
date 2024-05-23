package local.mydherin.users.infrastructure.shared.daos.userage.inmemory;

import local.mydherin.users.infrastructure.shared.daos.userage.UserAgeDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserAgeDAO {

    public List<UserAgeDTO> findAll() {
        return List.of(
                UserAgeDTO.of("1", 20),
                UserAgeDTO.of("2", 21),
                UserAgeDTO.of("3", 22)
        );
    }
}
