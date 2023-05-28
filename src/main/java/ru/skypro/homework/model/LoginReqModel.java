package ru.skypro.homework.model;

import lombok.Data;

import java.util.Objects;
/**
 Класс LoginReqModel содержит данные для авторизации пользователя. Этот класс используется для передачи информации
 с запросом на сервер.
 Класс имеет два поля – password и username, которые служат для хранения пароля и имени пользователя.
 */
@Data
public class LoginReqModel {

    //аннотацию @LoginReqProperty, описывает свойства поля (пароль или логин) и их описание. Подобные аннотации
    // могут использоваться для добавления информации о полях при создании документации или интерфейса пользователя.
    @LoginReqProperty(description = "пароль")
    private String password;

    @LoginReqProperty(description = "логин")
    private String username;

    public LoginReqModel(String password, String username) {
        this.password = password;
        this.username = username;
    }

}
