package ru.skypro.homework.model;

import lombok.Data;
import org.jetbrains.annotations.NotNull;
import ru.skypro.homework.dto.Role;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;
/**
 Данный класс является сущностью (@Entity) и предназначен для хранения данных пользователей в базе данных.
 Атрибуты класса предназначены для хранения различных данных о пользователях, таких как их имя, фамилия, телефон, роль
 */
@Entity//предназначен для хранения данных пользователей в базе данных.
@Data//автоматически создает методы hashCode(), equals(), toString(), геттеры и сеттеры.
@Table(name = "registerReqModel")//для создания таблицы в базе данных с именем "registerReqModel"
public class RegisterReqModel {
    @Id
    private Integer id;//первичный ключ таблицы
    @NotBlank//аннотация означает, что оно не может быть пустым.
    private String username;

    @NotBlank//аннотация означает, что оно не может быть пустым.
    private String password;

    @NotBlank//аннотация означает, что оно не может быть пустым.
    @Size(max = 50)//аннотация, которая задает ограничение на длину строки.Максимальная длина задается параметром max.
    private String firstName;

    @NotBlank//аннотация означает, что оно не может быть пустым.
    @Size(max = 50)//аннотация, которая задает ограничение на длину строки.Максимальная длина задается параметром max.
    private String lastName;

    @Pattern(regexp = "\\+7\\d{10}")// аннотация, которая указывает, что поле должно соответствовать заданному
    // регулярному выражению. В данном классе аннотация @Pattern(regexp = "\\+7\\d{10}") используется для поля
    // phone, которое должно содержать номер телефона в формате "+7" и еще 10 цифр.
    private String phone;

    @NotNull// аннотация, которая указывает, что поле не может иметь значение null.
    @Enumerated(EnumType.STRING)
    // аннотация @Enumerated, которая позволяет задать тип перечисления (EnumType.STRING или EnumType.ORDINAL) при сохранении его
    // значения в базе данных. В данном классе EnumType.STRING используется для поля role, который содержит значения
    // перечисления Role.
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

}
