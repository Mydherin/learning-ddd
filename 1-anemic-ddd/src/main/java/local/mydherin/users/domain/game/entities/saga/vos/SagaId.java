package local.mydherin.users.domain.game.entities.saga.vos;

import local.mydherin.users.domain.shared.ValueObject;

public final class SagaId extends ValueObject {
    private final String value;
    private SagaId(final String value) {
        this.value = value;
        this.ensureIsNotNull(value);
    }
    public String getValue() {
        return value;
    }
    public static SagaId of(final String value) {
        return new SagaId(value);
    }
}
