package local.mydherin.users.application.user.usecases;

import local.mydherin.users.application.user.repository.UserRepository;
import local.mydherin.users.domain.user.User;
import local.mydherin.users.shared.motherobject.user.ChrisBrown;
import local.mydherin.users.shared.motherobject.user.JohnDoe;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class GetUserCollectionTest {
    @MockBean
    private UserRepository userRepository;
    @Autowired
    private GetUserCollection getUserCollection;
    @Test
    void return_a_list_of_users_when_it_is_executed()
    {
        // Arrange
        final User johnDoe = JohnDoe.make();
        final User chrisBrown = ChrisBrown.make();
        final List<User> users = Arrays.asList(johnDoe, chrisBrown);
        Mockito.when(userRepository.findBy(null)).thenReturn(users);

        // Act
        final List<User> result = getUserCollection.execute();

        // Assert
        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals("John Doe", result.get(0).getName().getValue());
        Assertions.assertEquals("Chris Brown", result.get(1).getName().getValue());
    }
}