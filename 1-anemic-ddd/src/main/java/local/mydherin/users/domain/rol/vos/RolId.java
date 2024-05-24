package local.mydherin.users.domain.rol.vos;

import local.mydherin.users.domain.shared.ValueObject;

public class RolId extends ValueObject {

    private final String value;

    private RolId(String value) {
        this.value = value;
        this.ensureIsNotNull(value);
    }

    public String getValue() {
        return value;
    }

    public static RolId of(final String value) {
        return new RolId(value);
    }
}
