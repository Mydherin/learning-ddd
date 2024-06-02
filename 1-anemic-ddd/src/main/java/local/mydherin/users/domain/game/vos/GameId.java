package local.mydherin.users.domain.game.vos;

import local.mydherin.users.domain.shared.ValueObject;

public final class GameId extends ValueObject {
    private final String value;
    private GameId(final String value) {
        this.value = value;
        this.ensureIsNotNull(value);
    }
    public String getValue() {
        return value;
    }
    public static GameId of(final String value) {
        return new GameId(value);
    }
}
