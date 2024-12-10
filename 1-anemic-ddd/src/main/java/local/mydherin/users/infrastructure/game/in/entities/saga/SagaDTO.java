package local.mydherin.users.infrastructure.game.in.entities.saga;

import java.io.Serializable;

public final class SagaDTO implements Serializable {
    private final String relatedGameId;
    private SagaDTO(String relatedGameId)
    {
        this.relatedGameId = relatedGameId;
    }

    public String getGameId() {
        return relatedGameId;
    }

    public static SagaDTO of(String relatedGameId)
    {
        return new SagaDTO(relatedGameId);
    }
}
