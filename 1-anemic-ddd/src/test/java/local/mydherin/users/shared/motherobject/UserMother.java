package local.mydherin.users.shared.motherobject;

import local.mydherin.users.domain.user.User;
import local.mydherin.users.domain.user.vos.Age;
import local.mydherin.users.domain.user.vos.DNI;
import local.mydherin.users.domain.user.vos.Name;
import local.mydherin.users.domain.user.vos.UserId;

public final class UserMother {
    private UserMother()
    {}
    public static User getStandardUser()
    {
        return User.of(
                UserId.of("1"),
                Name.of("Any user 1"),
                Age.of(25),
                DNI.of("10000000Z"),
                RolMother.getTontorronRol()
        );
    }
    public static User getUserWithAdminRol()
    {
        return User.of(
                UserId.of("1"),
                Name.of("User with rol admin 1"),
                Age.of(25),
                DNI.of("10000000Z"),
                RolMother.getAdminRol()
        );
    }
    public static User getUserWithTontorronRol()
    {
        return User.of(
                UserId.of("1"),
                Name.of("User with rol tontorron 1"),
                Age.of(25),
                DNI.of("10000000Z"),
                RolMother.getTontorronRol()
        );
    }
}
