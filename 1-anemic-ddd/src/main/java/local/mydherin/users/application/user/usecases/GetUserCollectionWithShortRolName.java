package local.mydherin.users.application.user.usecases;

import local.mydherin.users.application.user.repository.UserRepository;
import local.mydherin.users.domain.user.User;
import local.mydherin.users.domain.user.services.FilterByShortRolName;
import local.mydherin.users.domain.user.services.queries.FilterByShortRolNameQuery;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetUserCollectionWithShortRolName {

    private final UserRepository userRepository;
    private final FilterByShortRolName filterByShortRolName;

    public GetUserCollectionWithShortRolName(UserRepository userRepository, FilterByShortRolName filterByShortRolName) {
        this.userRepository = userRepository;
        this.filterByShortRolName = filterByShortRolName;
    }

    public List<User> execute() {
        final var userCollection = userRepository.findBy(null);
        return filterByShortRolName(userCollection);
    }

    private List<User> filterByShortRolName(List<User> userCollection) {
        final var query = FilterByShortRolNameQuery.of(userCollection);
        return filterByShortRolName.execute(query);
    }

}
