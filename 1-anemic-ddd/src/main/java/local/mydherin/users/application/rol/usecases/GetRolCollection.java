package local.mydherin.users.application.rol.usecases;

import local.mydherin.users.application.rol.repository.RolRepository;
import local.mydherin.users.domain.rol.Rol;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetRolCollection {

    private final RolRepository repository;

    public GetRolCollection(RolRepository repository) {
        this.repository = repository;
    }

    public List<Rol> execute() {
        return repository.findAll();
    }

}
