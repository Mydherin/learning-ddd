package local.mydherin.users.application.user.usecases;

import local.mydherin.users.application.user.repository.UserRepository;
import local.mydherin.users.domain.user.User;
import local.mydherin.users.domain.user.vos.UserId;
import local.mydherin.users.shared.motherobject.user.AnyUser;
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
    void return_a_list_of_users()
    {
        // Arrange
        final var userId1 = "1";
        final var userId2 = "2";
        final var user1 = AnyUser.make(UserId.of(userId1));
        final var user2 = AnyUser.make(UserId.of(userId2));
        final List<User> users = Arrays.asList(user1, user2);
        Mockito.when(userRepository.findBy(null)).thenReturn(users);

        // Act
        final List<User> result = getUserCollection.execute();

        // Assert
        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals(userId1, result.get(0).getId().getValue());
        Assertions.assertEquals(userId2, result.get(1).getId().getValue());
    }
}