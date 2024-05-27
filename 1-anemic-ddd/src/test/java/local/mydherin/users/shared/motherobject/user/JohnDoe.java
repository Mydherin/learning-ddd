package local.mydherin.users.shared.motherobject.user;

import local.mydherin.users.domain.user.User;
import local.mydherin.users.domain.user.vos.Age;
import local.mydherin.users.domain.user.vos.DNI;
import local.mydherin.users.domain.user.vos.Name;
import local.mydherin.users.domain.user.vos.UserId;
import local.mydherin.users.shared.motherobject.rol.Admin;

public class JohnDoe {
    public static User make()
    {
        return User.of(
            UserId.of("1"),
            Name.of("John Doe"),
            Age.of(27),
            DNI.of("99999999A"),
            Admin.make()
        );
    }
}
