package local.mydherin.users.domain.user.vos;

import local.mydherin.users.domain.shared.ValueObject;

public class UserId extends ValueObject {

    private final String value;

    private UserId(String value) {
        this.value = value;
        this.ensureIsNotNull(value);
    }

    public String getValue() {
        return value;
    }

    public static UserId of(final String value) {
        return new UserId(value);
    }
}
