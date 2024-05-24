package local.mydherin.users.infrastructure.user.in.controllers;

import local.mydherin.users.application.user.usecases.GetUserCollectionWithShortRolName;
import local.mydherin.users.infrastructure.user.in.UserDTO;
import local.mydherin.users.infrastructure.user.in.UserDTOMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetUsersWithShortRolNameController {

    private final GetUserCollectionWithShortRolName usecase;
    private final UserDTOMapper mapper;

    public GetUsersWithShortRolNameController(GetUserCollectionWithShortRolName usecase, UserDTOMapper mapper) {
        this.usecase = usecase;
        this.mapper = mapper;
    }

    @GetMapping("/users/short-rol-name")
    public ResponseEntity<List<UserDTO>> execute() {
        final var userCollection = usecase.execute();
        return ResponseEntity.ok(this.mapper.fromDomain(userCollection));
    }
}
