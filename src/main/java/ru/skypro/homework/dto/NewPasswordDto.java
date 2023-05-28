package ru.skypro.homework.dto;

import lombok.Data;

/**
 * Класс NewPasswordDto является моделью, содержащей информацию о изменении пароля пользователя. Он содержит три поля
 * - id (идентификатор пользователя), currentPassword (действующий пароль) и newPassword (новый пароль).
 */
@Data//// добавляет методы getter и setter для каждого поля класса, а также методы toString, equals и hashCode.
public class NewPasswordDto {
    private Integer id;
    private String currentPassword;//действующий пароль
    private String newPassword;
}
