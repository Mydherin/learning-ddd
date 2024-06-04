package local.mydherin.users.infrastructure.shared.daos.game.inmemory;

import local.mydherin.users.infrastructure.shared.daos.game.GameDTO;
import local.mydherin.users.infrastructure.shared.daos.game.entities.SagaDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GameDAO {
    public List<GameDTO> findAll()
    {
        return List.of(
            new GameDTO("1", List.of(
                    new SagaDTO("2"),
                    new SagaDTO("3"),
                    new SagaDTO("4")
            )),
            new GameDTO("2", List.of(
                    new SagaDTO("1")
            )),
            new GameDTO("3", List.of(
                    new SagaDTO("1")
            )),
            new GameDTO("4", List.of(
                    new SagaDTO("1")
            ))
        );
    }
}
