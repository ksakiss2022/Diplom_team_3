package ru.skypro.homework.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Data
@Table(name = "newPassword")
public class NewPassword {
    @Id
    private Integer id;
    @NotBlank
    private String currentPassword;

    @NotBlank
    @Size(min = 6, max = 20)
    private String newPassword;


    public NewPassword(Integer id, String currentPassword, String newPassword) {
        this.id = id;
        this.currentPassword = currentPassword;
        this.newPassword = newPassword;
    }

    public NewPassword() {

    }


    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
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
        NewPassword that = (NewPassword) o;
        return id.equals(that.id) && currentPassword.equals(that.currentPassword) && newPassword.equals(that.newPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, currentPassword, newPassword);
    }


    @Override
    public String toString() {
        return "NewPassword{" +
                "id=" + id +
                ", currentPassword='" + currentPassword + '\'' +
                ", newPassword='" + newPassword + '\'' +
                '}';
    }

}
