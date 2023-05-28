package ru.skypro.homework.model;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Objects;
/**
 Аннотация @Entity говорит JPA/Hibernate, что класс является сущностью базы данных. Она позволяет привязать класс к
 таблице в базе данных. В данном случае класс User является сущностью, которая будет храниться в таблице "users".
 Атрибуты класса описывают различные параметры пользователя, такие как его имя, фамилию, адрес электронной почты,
 телефонную информацию и т.д.
 */
@Entity
@Data//добавляет в класс методы генерации геттеров, сеттеров, метода hashCode(), метода equals() и метода toString()
// для всех полей класса автоматически.
@Table(name = "users")// указывает, что таблица, с которой ассоциирован класс User, имеет имя "users".
public class User {


    @Id// указывает, что поле id является первичным ключом, уникальным для каждой записи таблицы.
    @GeneratedValue(strategy = GenerationType.IDENTITY)//указывает, что значения id генерируются автоматически.
    @NotNull//указывает, что поле не может иметь значение null.
    @Min(1)// указывает, что значение поля должно быть больше указанной константы.
    private Integer id;
    @NotBlank//указывает, что строковое значение поля не может быть пустым.
    @Email//указывает, что значение поля должно быть корректным email-адресом.
    private String email;

    @NotBlank////указывает, что строковое значение поля не может быть пустым.
    @Size(max = 50)//указывает ограничения на длину строки.
    private String firstName;

    @NotBlank////указывает, что строковое значение поля не может быть пустым.
    @Size(max = 50)//указывает ограничения на длину строки.
    private String lastName;

    @Pattern(regexp = "\\+7\\d{10}")// аннотация, которая указывает, что поле должно соответствовать заданному
    // регулярному выражению. В данном классе аннотация @Pattern(regexp = "\\+7\\d{10}") используется для поля
    // phone, которое должно содержать номер телефона в формате "+7" и еще 10 цифр.
    private String phone;

    private String image;


    public User(Integer id, String email, String firstName, String lastName, String phone, String image) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.image = image;
    }

    public User() {

    }

}
