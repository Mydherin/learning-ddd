package local.mydherin.users.application.user.usecases;

import local.mydherin.users.application.user.repository.UserRepository;
import local.mydherin.users.domain.rol.services.IsShort;
import local.mydherin.users.domain.user.User;
import local.mydherin.users.shared.motherobject.user.ChrisBrown;
import local.mydherin.users.shared.motherobject.user.JohnDoe;
import local.mydherin.users.shared.motherobject.user.Mortadelo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class GetUserCollectionWithShortRolNameTest {
    @MockBean
    private UserRepository userRepository;
    @Autowired
    private GetUserCollectionWithShortRolName getUserCollectionWithShortRolName;
    @Test
    void return_a_list_of_users_with_short_rol_name_when_it_is_executed_given_users_with_short_and_long_rol_names()
    {
        // Arrange
        final User johnDoe = JohnDoe.make();
        final User chrisBrown = ChrisBrown.make();
        final List<User> users = Arrays.asList(johnDoe, chrisBrown);
        Mockito.when(userRepository.findBy(null)).thenReturn(users);

        // Act
        final List<User> result = getUserCollectionWithShortRolName.execute();

        // Assert
        result.forEach(user -> {
            Assertions.assertTrue(user.getRol().getName().isShorterThan(IsShort.SHORT_NAME_LENGTH));
        });
    }

    @Test
    void return_an_empty_list_of_users_when_it_is_executed_given_users_with_only_long_rol_names()
    {
        // Arrange
        final User chrisBrown = ChrisBrown.make();
        final User mortadelo = Mortadelo.make();
        final List<User> users = Arrays.asList(mortadelo, chrisBrown);
        Mockito.when(userRepository.findBy(null)).thenReturn(users);

        // Act
        final List<User> result = getUserCollectionWithShortRolName.execute();

        // Assert
        Assertions.assertTrue(result.isEmpty());
    }
}
