package local.mydherin.users.infrastructure.shared.daos.usercore.entities;

import java.util.Objects;

public class UserCoreRolDTO {
    private String id;
    private String name;

    private UserCoreRolDTO(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserCoreRolDTO that)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static UserCoreRolDTO of(String id, String name) {
        return new UserCoreRolDTO(id, name);
    }
}
