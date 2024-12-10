package local.mydherin.users.domain.game.entities.saga.vos;

import local.mydherin.users.domain.shared.ValueObject;

public final class RelatedGameId extends ValueObject {
    private final String value;
    private RelatedGameId(final String value) {
        this.value = value;
        this.ensureIsNotNull(value);
    }
    public String getValue() {
        return value;
    }
    public static RelatedGameId of(final String value) {
        return new RelatedGameId(value);
    }
}
