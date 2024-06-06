package local.mydherin.users.infrastructure.game.in;

import local.mydherin.users.infrastructure.game.in.entities.saga.SagaDTO;

import java.io.Serializable;
import java.util.List;

public final class GameDTO implements Serializable {
    private final String gameId;
    private final List<SagaDTO> saga;

    private GameDTO(String gameId, List<SagaDTO> saga)
    {
        this.gameId = gameId;
        this.saga = saga;
    }

    public String getGameId()
    {
        return gameId;
    }

    public List<SagaDTO> getSaga()
    {
        return saga;
    }

    public static GameDTO of(String gameId, List<SagaDTO> saga)
    {
        return new GameDTO(gameId, saga);
    }
}
