package local.mydherin.users.domain.user.vos.services.queries;

import local.mydherin.users.domain.user.vos.Name;
import local.mydherin.users.domain.user.vos.UserId;

public class IdEqualsNameQuery {

    private final UserId userId;
    private final Name name;

    private IdEqualsNameQuery(final UserId userId, final Name name) {
        this.userId = userId;
        this.name = name;
    }

    public UserId getId() {
        return userId;
    }

    public Name getName() {
        return name;
    }

    public static IdEqualsNameQuery of(final UserId userId, final Name name) {
        return new IdEqualsNameQuery(userId, name);
    }

}
