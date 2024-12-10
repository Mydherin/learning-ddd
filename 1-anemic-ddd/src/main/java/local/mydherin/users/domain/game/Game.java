package local.mydherin.users.domain.game;

import local.mydherin.users.domain.game.entities.saga.Saga;
import local.mydherin.users.domain.game.vos.GameId;
import local.mydherin.users.domain.shared.AggregateRoot;

import java.util.List;

public final class Game extends AggregateRoot {
    private final GameId gameId;
    private final List<Saga> sagaList;
    private Game(final GameId gameId, final List<Saga> sagaList)
    {
        this.gameId = gameId;
        this.sagaList = sagaList;
        this.ensureIsNotNull(gameId);
        this.ensureIsNotNull(sagaList);
    }
    public GameId getGameId() {
        return gameId;
    }
    public List<Saga> getSagaList() {
        return sagaList;
    }
    public static Game of(final GameId gameId, final List<Saga> sagaList)
    {
        return new Game(gameId, sagaList);
    }
}
