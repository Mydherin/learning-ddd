package local.mydherin.users.infrastructure.shared.daos.game.entities;

public final class SagaDTO {
    private final String sagaId;
    public SagaDTO(String sagaId) {
        this.sagaId = sagaId;
    }
    public String getSagaId() {
        return sagaId;
    }
}
