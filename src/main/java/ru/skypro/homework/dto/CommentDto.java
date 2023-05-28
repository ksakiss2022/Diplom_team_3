package ru.skypro.homework.dto;

import lombok.Data;

/**
 * Класс CommentDto содержит поля для хранения информации о комментариях, такие как идентификатор, автор комментария,
 * изображение автора, время создания, текст комментария.
 */
@Data// позволяет генерировать методы getter и setter, а также методы hashCode, equals и toString для класса CommentDto.
public class CommentDto {
    private Integer id;
    private int author;
    private String authorImage;
    private String authorFirstName;
    private long createdAt;
    private int pk;
    private String text;
}
