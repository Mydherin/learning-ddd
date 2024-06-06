package local.mydherin.users.application.user.usecases;

import local.mydherin.users.application.user.repository.UserRepository;
import local.mydherin.users.domain.user.User;
import local.mydherin.users.shared.motherobject.UserMother;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public final class GetUserCollectionTest {
    @Mock
    private UserRepository userRepository;
    private GetUserCollection getUserCollection;
    @BeforeEach
    public void setUp() {
        getUserCollection = new GetUserCollection(
                userRepository
        );
    }
    @Test
    void user_repository_works_properly()
    {
        // Given
        final List<User> standardUserList = givenAListOfStandardUsers();
        when(userRepository.findBy(null)).thenReturn(standardUserList);

        // When
        final List<User> result = getUserCollection.execute();

        // Then
        thenUserRepositoryWorksProperly(standardUserList, result);
    }

    private List<User> givenAListOfStandardUsers()
    {
        return Arrays.asList(
                UserMother.getStandardUser(),
                UserMother.getStandardUser()
        );
    }

    private void thenUserRepositoryWorksProperly(final List<User> expected, final List<User> result)
    {
        assertEquals(expected, result);
        verify(userRepository).findBy(null);
    }
}