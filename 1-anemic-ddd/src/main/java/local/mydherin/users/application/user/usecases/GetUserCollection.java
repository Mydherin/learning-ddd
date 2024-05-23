package local.mydherin.users.application.user.usecases;

import local.mydherin.users.application.user.repository.UserRepository;
import local.mydherin.users.domain.user.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetUserCollection {

    private final UserRepository userRepository;

    public GetUserCollection(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> execute() {
        return userRepository.findBy(null);
    }

}
