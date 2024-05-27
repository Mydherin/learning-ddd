package local.mydherin.users.shared.motherobject.user;

import local.mydherin.users.domain.user.User;
import local.mydherin.users.domain.user.vos.Age;
import local.mydherin.users.domain.user.vos.DNI;
import local.mydherin.users.domain.user.vos.Name;
import local.mydherin.users.domain.user.vos.UserId;
import local.mydherin.users.shared.motherobject.rol.Tontorron;

public class Mortadelo {
    public static User make()
    {
        return User.of(
                UserId.of("3"),
                Name.of("Mortadelo"),
                Age.of(37),
                DNI.of("10000000Z"),
                Tontorron.make()
        );
    }
}
