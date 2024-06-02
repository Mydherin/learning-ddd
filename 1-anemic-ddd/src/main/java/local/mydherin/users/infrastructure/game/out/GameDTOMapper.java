package local.mydherin.users.infrastructure.game.out;

import local.mydherin.users.domain.game.Game;
import local.mydherin.users.domain.game.vos.GameId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class GameDTOMapper {
    public List<Game> toDomain(List<GameDTO> gameDTOList)
    {
        return gameDTOList
                .stream()
                .map(gameDTO -> Game.of(
                        GameId.of(gameDTO.getGameId()),
                        List.of()
                    )
                )
                .toList();
    }
}
