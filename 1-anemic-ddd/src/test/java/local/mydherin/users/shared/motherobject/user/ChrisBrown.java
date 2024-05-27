package local.mydherin.users.shared.motherobject.user;

import local.mydherin.users.domain.user.User;
import local.mydherin.users.domain.user.vos.Age;
import local.mydherin.users.domain.user.vos.DNI;
import local.mydherin.users.domain.user.vos.Name;
import local.mydherin.users.domain.user.vos.UserId;
import local.mydherin.users.shared.motherobject.rol.Tontorron;

public class ChrisBrown {
    public static User make()
    {
        return User.of(
                UserId.of("2"),
                Name.of("Chris Brown"),
                Age.of(56),
                DNI.of("00000000Z"),
                Tontorron.make()
        );
    }
}
