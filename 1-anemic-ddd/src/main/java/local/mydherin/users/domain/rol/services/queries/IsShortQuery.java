package local.mydherin.users.domain.rol.services.queries;

import local.mydherin.users.domain.rol.Rol;

public class IsShortQuery {

    private final Rol rol;

    private IsShortQuery(Rol rol) {
        this.rol = rol;
    }

    public Rol getRol() {
        return rol;
    }

    public static IsShortQuery of(final Rol rol) {
        return new IsShortQuery(rol);
    }
}
