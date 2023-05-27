package ru.skypro.homework.model;

import lombok.Data;
import org.jetbrains.annotations.NotNull;
import ru.skypro.homework.dto.Role;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Data
@Table(name = "registerReqModel")
public class RegisterReqModel {
    @Id
    private Integer id;
    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @NotBlank
    @Size(max = 50)
    private String firstName;

    @NotBlank
    @Size(max = 50)
    private String lastName;

    @Pattern(regexp = "\\+7\\d{10}")
    private String phone;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Role role;

    public RegisterReqModel(String username, String password, String firstName, String lastName, String phone, @NotNull Role role) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.role = role;
    }

    public RegisterReqModel() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @NotNull
    public Role getRole() {
        return role;
    }

    public void setRole(@NotNull Role role) {
        this.role = role;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegisterReqModel that = (RegisterReqModel) o;
        return id.equals(that.id) && username.equals(that.username) && password.equals(that.password) && firstName.equals(that.firstName) && lastName.equals(that.lastName) && phone.equals(that.phone) && role == that.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, firstName, lastName, phone, role);
    }

    @Override
    public String toString() {
        return "RegisterReqModel{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", role=" + role +
                '}';
    }

}
