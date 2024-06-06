package local.mydherin.users.domain.game.entities.saga;

import local.mydherin.users.domain.game.entities.saga.vos.GameId;
import local.mydherin.users.domain.game.entities.saga.vos.RelatedGameId;
import local.mydherin.users.domain.game.entities.saga.vos.SagaId;
import local.mydherin.users.domain.shared.AggregateRoot;

public final class Saga extends AggregateRoot {
    private final SagaId sagaId;
    private final GameId gameId;
    private final RelatedGameId relatedGameId;

    private Saga(final SagaId sagaId, final GameId gameId, final RelatedGameId relatedGameId)
    {
        this.sagaId = sagaId;
        this.gameId = gameId;
        this.relatedGameId = relatedGameId;
        this.ensureIsNotNull(sagaId);
        this.ensureIsNotNull(gameId);
        this.ensureIsNotNull(relatedGameId);
    }
    public SagaId getSagaId() {
        return sagaId;
    }
    public GameId getGameId() {
        return gameId;
    }
    public RelatedGameId getRelatedGameId() {
        return relatedGameId;
    }
    public static Saga of(final SagaId sagaId, final GameId gameId, final RelatedGameId relatedGameId)
    {
        return new Saga(sagaId, gameId, relatedGameId);
    }
}
