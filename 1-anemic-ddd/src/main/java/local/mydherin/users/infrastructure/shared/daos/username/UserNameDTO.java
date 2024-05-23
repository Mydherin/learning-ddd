package local.mydherin.users.infrastructure.shared.daos.username;

public class UserNameDTO {
    private String id;
    private String name;

    private UserNameDTO(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static UserNameDTO of(String id, String name) {
        return new UserNameDTO(id, name);
    }
}
