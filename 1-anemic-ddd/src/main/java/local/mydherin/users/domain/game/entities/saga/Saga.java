package local.mydherin.users.domain.game.entities.saga;

import local.mydherin.users.domain.game.entities.saga.vos.GameId;
import local.mydherin.users.domain.game.entities.saga.vos.SagaId;
import local.mydherin.users.domain.shared.AggregateRoot;

public final class Saga extends AggregateRoot {
    private final SagaId sagaId;
    private final GameId gameId;

    private Saga(final SagaId sagaId, final GameId gameId)
    {
        this.sagaId = sagaId;
        this.gameId = gameId;
        this.ensureIsNotNull(sagaId);
        this.ensureIsNotNull(gameId);
    }
    public SagaId getSagaId() {
        return sagaId;
    }
    public GameId getGameId() {
        return gameId;
    }
    public static Saga of(final SagaId sagaId, final GameId gameId)
    {
        return new Saga(sagaId, gameId);
    }
}
