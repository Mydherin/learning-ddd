package local.mydherin.users.infrastructure.game.in;

import java.io.Serializable;

public final class GameDTO implements Serializable {
    private final String gameId;

    private GameDTO(String gameId)
    {
        this.gameId = gameId;
    }

    public String getGameId()
    {
        return gameId;
    }

    public static GameDTO of(String gameId)
    {
        return new GameDTO(gameId);
    }
}
