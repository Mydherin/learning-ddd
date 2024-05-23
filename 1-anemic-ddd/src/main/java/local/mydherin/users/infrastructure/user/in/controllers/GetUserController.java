package local.mydherin.users.infrastructure.user.in.controllers;

import local.mydherin.users.application.user.usecases.GetUserCollection;
import local.mydherin.users.infrastructure.user.in.UserDTO;
import local.mydherin.users.infrastructure.user.in.UserDTOMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetUserController {

    private final GetUserCollection getUserCollection;
    private final UserDTOMapper mapper;

    public GetUserController(GetUserCollection getUserCollection, UserDTOMapper mapper) {
        this.getUserCollection = getUserCollection;
        this.mapper = mapper;
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserDTO>> execute() {
        final var userCollection = getUserCollection.execute();
        return ResponseEntity.ok(this.mapper.fromDomain(userCollection));
    }
}
