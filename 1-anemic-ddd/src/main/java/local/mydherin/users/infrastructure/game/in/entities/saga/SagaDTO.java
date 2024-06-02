package local.mydherin.users.infrastructure.game.in.entities.saga;

import java.io.Serializable;

public final class SagaDTO implements Serializable {
    private final String gameId;
    private SagaDTO(String gameId)
    {
        this.gameId = gameId;
    }
    public String getGameId() {
        return gameId;
    }

    public static SagaDTO of(String gameId)
    {
        return new SagaDTO(gameId);
    }
}
