package local.mydherin.users.infrastructure.game.out;

import local.mydherin.users.domain.game.Game;
import local.mydherin.users.domain.game.vos.GameId;
import local.mydherin.users.infrastructure.game.out.entities.saga.SagaDTOMapper;
import local.mydherin.users.infrastructure.shared.daos.game.GameDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class GameDTOMapper {
    private final SagaDTOMapper sagaDTOMapper;
    public GameDTOMapper(final SagaDTOMapper sagaDTOMapper)
    {
        this.sagaDTOMapper = sagaDTOMapper;
    }
    public List<Game> toDomain(List<GameDTO> gameDTOList)
    {
        return gameDTOList
                .stream()
                .map(gameDTO -> Game.of(
                        GameId.of(gameDTO.getGameId()),
                        sagaDTOMapper.toDomain(gameDTO.getSagaDTOList())
                    )
                )
                .toList();
    }
}
