package local.mydherin.users.domain.user.vos;

import local.mydherin.users.domain.shared.ValueObject;

public class DNI extends ValueObject {

    private final String value;

    private DNI(final String value) {
        this.value = value;
        this.ensureIsNotNull(value);
    }

    public String getValue() {
        return value;
    }

    public static DNI of(final String value) {
        return new DNI(value);
    }

}
