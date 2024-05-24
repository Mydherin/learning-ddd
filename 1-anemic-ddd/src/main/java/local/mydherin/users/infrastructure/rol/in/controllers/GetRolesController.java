package local.mydherin.users.infrastructure.rol.in.controllers;

import local.mydherin.users.application.rol.usecases.GetRolCollection;
import local.mydherin.users.infrastructure.rol.in.RolDTO;
import local.mydherin.users.infrastructure.rol.in.RolDTOMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetRolesController {

    private final GetRolCollection usecase;
    private final RolDTOMapper mapper;

    public GetRolesController(GetRolCollection usecase, RolDTOMapper mapper) {
        this.usecase = usecase;
        this.mapper = mapper;
    }

    @GetMapping("/roles")
    public ResponseEntity<List<RolDTO>> execute() {
        final var rolCollection = usecase.execute();
        return ResponseEntity.ok(this.mapper.fromDomain(rolCollection));
    }
}
