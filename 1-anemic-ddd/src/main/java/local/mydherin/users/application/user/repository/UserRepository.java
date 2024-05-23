package local.mydherin.users.application.user.repository;

import local.mydherin.users.domain.user.User;

import java.util.List;

public interface UserRepository {

    List<User> findBy(final UserCriteria criteria);
}
