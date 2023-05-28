package ru.skypro.homework.dto;

import lombok.Data;
import ru.skypro.homework.model.Comment;

import java.util.List;

/**
 * Класс ResponseWrapperCommentDto используется для обертывания списка комментариев Comment в ответ на запрос,
 * включая количество комментариев в списке.
 */
@Data//// добавляет методы getter и setter для каждого поля класса, а также методы toString, equals и hashCode.
public class ResponseWrapperCommentDto {
    private int count;//содержит количество комментариев
    private List<Comment> results;//список объектов Comment, содержащих информацию об отдельных комментариях.
}
