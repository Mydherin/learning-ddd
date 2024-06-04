package local.mydherin.users.infrastructure.shared.daos.game.entities;

public final class SagaDTO {
    private final String sagaId;
    private final String gameId;
    public SagaDTO(String sagaId, String gameId) {
        this.sagaId = sagaId;
        this.gameId = gameId;
    }
    public String getSagaId() {
        return sagaId;
    }
    public String getGameId() {
        return gameId;
    }
}
