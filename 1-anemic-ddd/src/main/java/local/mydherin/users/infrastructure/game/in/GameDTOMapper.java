package local.mydherin.users.infrastructure.game.in;

import local.mydherin.users.domain.game.Game;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ControllerGameDTOMapper")
public final class GameDTOMapper {
    public List<GameDTO> fromDomain(List<Game> gameList)
    {
        return gameList
                .stream()
                .map(game -> GameDTO.of(game.getGameId().getValue()))
                .toList();
    }
}
