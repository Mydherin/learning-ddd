package local.mydherin.users.infrastructure.game.out.entities.saga;

public final class SagaDTO {
    private final String sagaId;
    private final String gameId;
    public SagaDTO(String sagaId, String gameId)
    {
        this.sagaId = sagaId;
        this.gameId = gameId;
    }
    public String getSagaId()
    {
        return sagaId;
    }
    public String getGameId()
    {
        return gameId;
    }
    public static SagaDTO of(String sagaId, String gameId)
    {
        return new SagaDTO(sagaId, gameId);
    }
}
