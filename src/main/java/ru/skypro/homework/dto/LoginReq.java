package ru.skypro.homework.dto;

import lombok.Data;

/**
 * Класс LoginReq является моделью запроса для аутентификации пользователя.
 * Он содержит два поля - password (пароль) и username (имя пользователя).
 */
@Data//// добавляет методы getter и setter для каждого поля класса, а также методы toString, equals и hashCode.
public class LoginReq {
    private String password;
    private String username;

}
