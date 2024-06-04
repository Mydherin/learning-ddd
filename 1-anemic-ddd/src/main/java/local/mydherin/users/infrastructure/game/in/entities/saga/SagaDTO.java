package local.mydherin.users.infrastructure.game.in.entities.saga;

import java.io.Serializable;

public final class SagaDTO implements Serializable {
    private final String sagaId;
    private final String gameId;
    private SagaDTO(String sagaId, String gameId)
    {
        this.sagaId = sagaId;
        this.gameId = gameId;
    }
    public String getSagaId() {
        return sagaId;
    }
    public String getGameId() {
        return gameId;
    }

    public static SagaDTO of(String sagaId, String gameId)
    {
        return new SagaDTO(sagaId, gameId);
    }
}
