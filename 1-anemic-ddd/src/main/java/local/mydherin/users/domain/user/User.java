package local.mydherin.users.domain.user;

import local.mydherin.users.domain.shared.AggregateRoot;
import local.mydherin.users.domain.user.entities.rol.Rol;
import local.mydherin.users.domain.user.vos.Age;
import local.mydherin.users.domain.user.vos.DNI;
import local.mydherin.users.domain.user.vos.Name;
import local.mydherin.users.domain.user.vos.UserId;
import local.mydherin.users.domain.user.vos.services.IdEqualsName;
import local.mydherin.users.domain.user.vos.services.queries.IdEqualsNameQuery;

public class User extends AggregateRoot {
    private final UserId userId;
    private final Name name;
    private final Age age;
    private final DNI dni;
    private final Rol rol;

    private User(
            final UserId userId,
            final Name name,
            final Age age,
            final DNI dni,
            final Rol rol) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.dni = dni;
        this.rol = rol;
        this.ensureIsNotNull(userId);
        this.ensureIsNotNull(name);
        this.ensureIsNotNull(age);
        this.ensureIsNotNull(dni);
        this.ensureIsNotNull(rol);
        this.ensureIdAndNameAreDifferent(userId, name);
    }

    public UserId getId() {
        return userId;
    }

    public Name getName() {
        return name;
    }

    public Age getAge() {
        return age;
    }

    public DNI getDni() {
        return dni;
    }

    public Rol getRol() {
        return rol;
    }

    private void ensureIdAndNameAreDifferent(final UserId userId, final Name name) {
        final var query = IdEqualsNameQuery.of(userId, name);
        IdEqualsName.execute(query);
    }

    public static User of(
            final UserId userId,
            final Name name,
            final Age age,
            final DNI dni,
            final Rol rol) {
        return new User(userId, name, age, dni, rol);
    }
}
