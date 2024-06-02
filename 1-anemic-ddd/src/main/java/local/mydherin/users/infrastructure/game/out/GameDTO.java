package local.mydherin.users.infrastructure.game.out;

public final class GameDTO {
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
