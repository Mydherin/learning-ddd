package local.mydherin.users.domain.user.entities.rol;

import local.mydherin.users.domain.shared.Entity;
import local.mydherin.users.domain.user.entities.rol.vos.Name;
import local.mydherin.users.domain.user.entities.rol.vos.RolId;

public class Rol extends Entity {

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
