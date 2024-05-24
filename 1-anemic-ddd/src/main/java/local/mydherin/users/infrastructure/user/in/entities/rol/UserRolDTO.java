package local.mydherin.users.infrastructure.user.in.entities.rol;

import java.io.Serializable;

public class UserRolDTO implements Serializable {
    private String id;

    private UserRolDTO(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public static UserRolDTO of(String id) {
        return new UserRolDTO(id);
    }
}
