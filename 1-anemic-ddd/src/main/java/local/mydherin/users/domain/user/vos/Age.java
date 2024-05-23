package local.mydherin.users.domain.user.vos;

import local.mydherin.users.domain.shared.ValueObject;

public class Age extends ValueObject {

    private final Integer value;

    private Age(final Integer value) {
        this.value = value;
        this.ensureIsNotNull(value);
        this.ensureIsAdult(value);
    }

    private void ensureIsAdult(final Integer value) {
        if (value < 18) {
            throw new IllegalArgumentException("Age must be greater than 18");
        }
    }

    public Integer getValue() {
        return value;
    }

    public static Age of(final Integer value) {
        return new Age(value);
    }
}
