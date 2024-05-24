package local.mydherin.users.application.rol.repository;

import local.mydherin.users.domain.rol.Rol;

import java.util.List;

public interface RolRepository {

    List<Rol> findAll();
}
