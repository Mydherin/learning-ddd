package local.mydherin.users.infrastructure.game.in;

import local.mydherin.users.domain.game.Game;
import local.mydherin.users.infrastructure.game.in.entities.saga.SagaDTOMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ControllerGameDTOMapper")
public final class GameDTOMapper {
    private final SagaDTOMapper sagaDTOMapper;

    public GameDTOMapper(SagaDTOMapper sagaDTOMapper)
    {
        this.sagaDTOMapper = sagaDTOMapper;
    }
    public List<GameDTO> fromDomain(List<Game> gameList)
    {
        return gameList
                .stream()
                .map(game -> GameDTO.of(
                        game.getGameId().getValue(),
                        sagaDTOMapper.fromDomain(game.getSagaList())
                ))
                .toList();
    }
}
