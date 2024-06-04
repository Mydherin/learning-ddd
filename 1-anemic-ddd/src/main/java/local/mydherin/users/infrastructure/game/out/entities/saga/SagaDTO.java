package local.mydherin.users.infrastructure.game.out.entities.saga;

public final class SagaDTO {
    private final String sagaId;
    public SagaDTO(String sagaId)
    {
        this.sagaId = sagaId;
    }
    public String getSagaId()
    {
        return sagaId;
    }
    public static SagaDTO of(String sagaId)
    {
        return new SagaDTO(sagaId);
    }
}
