package local.mydherin.users.shared.motherobject;

import local.mydherin.users.domain.rol.Rol;
import local.mydherin.users.domain.rol.vos.Name;
import local.mydherin.users.domain.rol.vos.RolId;

public final class RolMother {
    private RolMother()
    {}

    public static Rol getAdminRol()
    {
        return Rol.of(
                RolId.of("1"),
                Name.of("ADMIN")
        );
    }

    public static Rol getTontorronRol()
    {
        return Rol.of(
                RolId.of("2"),
                Name.of("TONTORRON")
        );
    }
}
