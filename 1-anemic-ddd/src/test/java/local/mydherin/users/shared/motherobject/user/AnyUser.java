package local.mydherin.users.shared.motherobject.user;

import local.mydherin.users.domain.user.User;
import local.mydherin.users.domain.user.vos.Age;
import local.mydherin.users.domain.user.vos.DNI;
import local.mydherin.users.domain.user.vos.Name;
import local.mydherin.users.domain.user.vos.UserId;
import local.mydherin.users.shared.motherobject.rol.Tontorron;

public class AnyUser {
    public static User make(UserId userId)
    {
        return User.of(
                userId,
                Name.of("Any user " + userId.getValue()),
                Age.of(25),
                DNI.of("10000000Z"),
                Tontorron.make()
        );
    }
}
