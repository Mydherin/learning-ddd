package local.mydherin.users.shared.motherobject.rol;

import local.mydherin.users.domain.rol.Rol;
import local.mydherin.users.domain.rol.vos.Name;
import local.mydherin.users.domain.rol.vos.RolId;

public class Tontorron {
    public static Rol make()
    {
        return Rol.of(
                RolId.of("2"),
                Name.of("TONTORRON")
        );
    }
}
