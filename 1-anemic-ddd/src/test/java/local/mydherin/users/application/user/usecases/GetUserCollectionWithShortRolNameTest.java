package local.mydherin.users.application.user.usecases;

import local.mydherin.users.application.user.repository.UserRepository;
import local.mydherin.users.domain.rol.services.IsShort;
import local.mydherin.users.domain.user.User;
import local.mydherin.users.domain.user.services.FilterByShortRolName;
import local.mydherin.users.shared.motherobject.UserMother;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public final class GetUserCollectionWithShortRolNameTest {
    @Mock
    private UserRepository userRepository;
    private GetUserCollectionWithShortRolName getUserCollectionWithShortRolName;
    @BeforeEach
    public void setUp() {
        getUserCollectionWithShortRolName = new GetUserCollectionWithShortRolName(
                userRepository,
                new FilterByShortRolName(new IsShort())
        );
    }
    @Test
    void return_a_list_of_users_with_short_rol_name_given_users_with_short_and_long_rol_names()
    {
        // Given
        final List<User> userList = givenAListOfUsersWithLongAndShortRolNames();
        Mockito.when(userRepository.findBy(null)).thenReturn(userList);

        // When
        final List<User> result = getUserCollectionWithShortRolName.execute();

        // Then
        thenAllUsersHaveShortRolName(result);
    }

    @Test
    void return_an_empty_list_of_users_given_users_with_only_long_rol_names()
    {
        // Given
        final List<User> userList = givenAListOfUsersWithOnlyLongRolNames();
        Mockito.when(userRepository.findBy(null)).thenReturn(userList);

        // When
        final List<User> result = getUserCollectionWithShortRolName.execute();

        // Then
        thenTheListOfUsersIsEmpty(result);
    }

    private List<User> givenAListOfUsersWithLongAndShortRolNames()
    {
        return Arrays.asList(
                UserMother.getUserWithAdminRol(),
                UserMother.getUserWithTontorronRol()
        );
    }

    private List<User> givenAListOfUsersWithOnlyLongRolNames()
    {
        return Arrays.asList(
                UserMother.getUserWithTontorronRol(),
                UserMother.getUserWithTontorronRol()
        );
    }

    private void thenAllUsersHaveShortRolName(List<User> userList)
    {
        userList.forEach(user -> {
            Assertions.assertTrue(user.getRol().getName().isShorterThan(IsShort.SHORT_NAME_LENGTH));
        });
    }

    private void thenTheListOfUsersIsEmpty(List<User> userList)
    {
        Assertions.assertTrue(userList.isEmpty());
    }
}
