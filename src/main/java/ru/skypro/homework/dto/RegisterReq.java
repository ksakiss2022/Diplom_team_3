package ru.skypro.homework.dto;

import lombok.Data;

/**
 * Класс RegisterReq является моделью для запроса на регистрацию пользователя и содержит информацию об имени,
 * фамилии, пароле, роли и других параметрах пользователя.
 */
@Data//// добавляет методы getter и setter для каждого поля класса, а также методы toString, equals и hashCode.
public class RegisterReq {
    private Integer id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String phone;
    private Role role;


}
