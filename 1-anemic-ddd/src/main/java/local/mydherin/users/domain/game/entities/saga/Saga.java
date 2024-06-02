package local.mydherin.users.domain.game.entities.saga;

import local.mydherin.users.domain.game.entities.saga.vos.SagaId;
import local.mydherin.users.domain.shared.AggregateRoot;

public final class Saga extends AggregateRoot {
    private final SagaId sagaId;
    private Saga(final SagaId sagaId)
    {
        this.sagaId = sagaId;
        this.ensureIsNotNull(sagaId);
    }
    public SagaId getSagaId() {
        return sagaId;
    }
    public static Saga of(final SagaId sagaId)
    {
        return new Saga(sagaId);
    }
}
