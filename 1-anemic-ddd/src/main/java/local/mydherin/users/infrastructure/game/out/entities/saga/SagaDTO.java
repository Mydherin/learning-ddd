package local.mydherin.users.infrastructure.game.out.entities.saga;

public final class SagaDTO {
    private final String sagaId;
    private final String gameId;
    private final String relatedGameId;
    public SagaDTO(String sagaId, String gameId, String relatedGameId)
    {
        this.sagaId = sagaId;
        this.gameId = gameId;
        this.relatedGameId = relatedGameId;
    }
    public String getSagaId()
    {
        return sagaId;
    }
    public String getGameId()
    {
        return gameId;
    }
    public String getRelatedGameId()
    {
        return relatedGameId;
    }
    public static SagaDTO of(String sagaId, String gameId, String relatedGameId)
    {
        return new SagaDTO(sagaId, gameId, relatedGameId);
    }
}
