package local.mydherin.users.infrastructure.user.in.entities.rol;

import java.io.Serializable;

public class UserRolDTO implements Serializable {
    private String id;
    private String name;

    private UserRolDTO(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static UserRolDTO of(String id, String name) {
        return new UserRolDTO(id, name);
    }
}
