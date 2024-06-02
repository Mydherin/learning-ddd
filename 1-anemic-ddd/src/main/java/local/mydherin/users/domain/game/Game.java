package local.mydherin.users.domain.game;

import local.mydherin.users.domain.game.vos.GameId;
import local.mydherin.users.domain.shared.AggregateRoot;

public class Game extends AggregateRoot {
    private final GameId gameId;
    private Game(final GameId gameId)
    {
        this.gameId = gameId;
        this.ensureIsNotNull(gameId);
    }
    public GameId getGameId() {
        return gameId;
    }
    public static Game of(final GameId gameId)
    {
        return new Game(gameId);
    }
}
