package local.mydherin.users.application.game.usecases;

import local.mydherin.users.application.game.repository.GameRepository;
import local.mydherin.users.domain.game.Game;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class GetGameCollection {
    private final GameRepository gameRepository;
    public GetGameCollection(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }
    public List<Game> execute()
    {
        return gameRepository.findBy();
    }
}
