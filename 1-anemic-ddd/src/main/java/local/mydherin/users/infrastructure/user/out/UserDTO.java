package local.mydherin.users.infrastructure.user.out;

import local.mydherin.users.infrastructure.user.out.entities.rol.UserRolDTO;

public class UserDTO {
    private String id;
    private String name;
    private Integer age;

    private String DNI;

    private UserRolDTO rolDTO;

    private UserDTO(String id, String name, Integer age, String DNI, UserRolDTO rolDTO) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.DNI = DNI;
        this.rolDTO = rolDTO;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getDNI() {
        return DNI;
    }

    public UserRolDTO getRolDTO() {
        return rolDTO;
    }

    public static UserDTO of(String id, String name, Integer age, String DNI, UserRolDTO rolDTO) {
        return new UserDTO(id, name, age, DNI, rolDTO);
    }
}
