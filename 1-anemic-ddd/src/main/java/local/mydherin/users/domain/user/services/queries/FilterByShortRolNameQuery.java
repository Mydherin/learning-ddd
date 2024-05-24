package local.mydherin.users.domain.user.services.queries;

import local.mydherin.users.domain.user.User;

import java.util.List;

public final class FilterByShortRolNameQuery {

    private final List<User> collection;

    private FilterByShortRolNameQuery(List<User> collection) {
        this.collection = collection;
    }

    public List<User> getCollection() {
        return collection;
    }

    public static FilterByShortRolNameQuery of(final List<User> collection) {
        return new FilterByShortRolNameQuery(collection);
    }
}
