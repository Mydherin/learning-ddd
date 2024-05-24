package local.mydherin.users.domain.rol;

import local.mydherin.users.domain.rol.vos.Name;
import local.mydherin.users.domain.rol.vos.RolId;
import local.mydherin.users.domain.shared.AggregateRoot;

public class Rol extends AggregateRoot {

    private final RolId id;
    private final Name name;

    private Rol(final RolId id, final Name name) {
        this.id = id;
        this.name = name;
        this.ensureIsNotNull(id);
        this.ensureIsNotNull(name);
    }

    public RolId getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    public static Rol of(final RolId id, final Name name) {
        return new Rol(id, name);
    }
}
