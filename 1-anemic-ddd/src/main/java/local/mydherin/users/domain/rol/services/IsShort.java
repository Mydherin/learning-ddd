package local.mydherin.users.domain.rol.services;

import local.mydherin.users.domain.rol.services.queries.IsShortQuery;

public class IsShort {

    private final Integer SHORT_NAME_LENGTH = 5;

    public Boolean execute(final IsShortQuery query) {
        final var rol = query.getRol();
        return rol.getName().isShorterThan(SHORT_NAME_LENGTH);
    }
}
