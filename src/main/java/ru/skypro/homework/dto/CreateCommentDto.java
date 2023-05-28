package ru.skypro.homework.dto;

import lombok.Data;

/**
 * Класс CreateCommentDto содержит поле text, которое представляет текст комментария.
 */
@Data//добавляет методы getter и setter для поля text, а также методы toString, equals и hashCode.

public class CreateCommentDto {
    private String text;
}
