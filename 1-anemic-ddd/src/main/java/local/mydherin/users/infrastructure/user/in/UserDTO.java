package local.mydherin.users.infrastructure.user.in;

import local.mydherin.users.infrastructure.user.in.entities.rol.UserRolDTO;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private String id;
    private String name;
    private Integer age;
    private String dni;
    private UserRolDTO rol;

    private UserDTO(String id, String name, Integer age, String dni, UserRolDTO rol) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dni = dni;
        this.rol = rol;
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

    public String getDni() {
        return dni;
    }

    public UserRolDTO getRol() {
        return rol;
    }

    public static UserDTO of(String id, String name, Integer age, String dni, UserRolDTO rolDTO) {
        return new UserDTO(id, name, age, dni, rolDTO);
    }
}
