package local.mydherin.users.domain.user.vos.services;

import local.mydherin.users.domain.user.vos.services.queries.IdEqualsNameQuery;

public final class IdEqualsName {

    private IdEqualsName() {
    }

    public static void execute(final IdEqualsNameQuery query) {
        final var rawId = query.getId().getValue();
        final var rawName = query.getName().getValue();
        if (rawId.equals(rawName)) {
            throw new IllegalArgumentException("Id and name must be different");
        }
    }
}
