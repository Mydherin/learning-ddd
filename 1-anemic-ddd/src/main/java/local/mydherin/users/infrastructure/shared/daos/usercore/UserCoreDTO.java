package local.mydherin.users.infrastructure.shared.daos.usercore;

public class UserCoreDTO {
    private String id;
    private String dni;

    private RolDTO rol;

    public UserCoreDTO(String id, String dni, RolDTO rol) {
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

    public RolDTO getRol() {
        return rol;
    }

    public static UserCoreDTO of(String id, String dni, RolDTO rol) {
        return new UserCoreDTO(id, dni, rol);
    }


}
