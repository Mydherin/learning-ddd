package local.mydherin.users.infrastructure.rol.out;

public class RolDTO {
    private String id;
    private String name;

    private RolDTO(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static RolDTO of(String id, String name) {
        return new RolDTO(id, name);
    }
}
