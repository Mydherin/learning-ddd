package local.mydherin.users.infrastructure.game.in.entities.saga;

import java.io.Serializable;

public final class SagaDTO implements Serializable {
    private final String sagaId;
    private SagaDTO(String sagaId)
    {
        this.sagaId = sagaId;
    }

    public String getSagaId() {
        return sagaId;
    }

    public static SagaDTO of(String sagaId)
    {
        return new SagaDTO(sagaId);
    }
}
