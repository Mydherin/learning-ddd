package local.mydherin.users.infrastructure.shared.daos.usercore;

import local.mydherin.users.infrastructure.shared.daos.usercore.entities.UserCoreRolDTO;

public class UserCoreDTO {
    private String id;
    private String dni;

    private UserCoreRolDTO rol;

    public UserCoreDTO(String id, String dni, UserCoreRolDTO rol) {
        this.id = id;
        this.dni = dni;
        this.rol = rol;
    }

    public String getId() {
        return id;
    }

    public String getDni() {
        return dni;
    }

    public UserCoreRolDTO getRol() {
        return rol;
    }

    public static UserCoreDTO of(String id, String dni, UserCoreRolDTO rol) {
        return new UserCoreDTO(id, dni, rol);
    }


}
