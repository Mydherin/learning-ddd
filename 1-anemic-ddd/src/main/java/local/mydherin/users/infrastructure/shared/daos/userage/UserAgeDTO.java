package local.mydherin.users.infrastructure.shared.daos.userage;

public class UserAgeDTO {

    private final String id;
    private final Integer age;

    private UserAgeDTO(String id, Integer age) {
        this.id = id;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public static UserAgeDTO of(String id, Integer age) {
        return new UserAgeDTO(id, age);
    }
}
