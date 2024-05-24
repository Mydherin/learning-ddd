package local.mydherin.users.domain.rol.vos;

import local.mydherin.users.domain.shared.ValueObject;

public class Name extends ValueObject {

    private final String value;

    private Name(final String value) {
        this.value = value;
        this.ensureIsNotNull(value);
    }

    public Boolean isShorterThan(final Integer length) {
        return value.length() <= length;
    }

    public String getValue() {
        return value;
    }

    public static Name of(final String value) {
        return new Name(value);
    }

}
