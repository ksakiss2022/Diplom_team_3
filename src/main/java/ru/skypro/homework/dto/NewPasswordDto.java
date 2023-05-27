package ru.skypro.homework.dto;

import lombok.Data;

@Data
public class NewPasswordDto {
    private Integer id;
    private String currentPassword;//действующий пароль
    private String newPassword;
}
