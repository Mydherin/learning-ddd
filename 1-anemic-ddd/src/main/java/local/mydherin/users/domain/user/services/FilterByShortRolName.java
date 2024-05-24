package local.mydherin.users.domain.user.services;

import local.mydherin.users.domain.rol.Rol;
import local.mydherin.users.domain.rol.services.IsShort;
import local.mydherin.users.domain.rol.services.queries.IsShortQuery;
import local.mydherin.users.domain.user.User;
import local.mydherin.users.domain.user.services.queries.FilterByShortRolNameQuery;

import java.util.List;

public class FilterByShortRolName {

    private final IsShort isRolShort;

    public FilterByShortRolName(IsShort isRolShort) {
        this.isRolShort = isRolShort;
    }

    public List<User> execute(final FilterByShortRolNameQuery query) {
        final var userCollection = query.getCollection();
        return userCollection.stream().filter(user -> this.isRolShort(user.getRol())).toList();
    }

    private Boolean isRolShort(final Rol rol) {
        final var query = IsShortQuery.of(rol);
        return this.isRolShort.execute(query);
    }
}
