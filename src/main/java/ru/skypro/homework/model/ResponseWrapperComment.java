package ru.skypro.homework.model;

import lombok.Data;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
/**
 Класс ResponseWrapperComment предназначен для обертывания ответа API, содержащего количество комментариев и список
 комментариев.
 */
@Data
public class ResponseWrapperComment {
    @Positive(message = "Значение count должно быть положительным")//указывает, что поле count должно быть положительным
    // , это ограничение на значение поля.
    private int count;

    //Аннотация @Valid указывает, что содержимое списка results должно быть проверено на наличие всех аннотаций,
    // заданных в классе Comment, таких как, например, @NotNull или @NotBlank. Если объекты списка не проходят проверку,
    // то будет выброшено исключение.
    @Valid
    @NotNull(message = "Список комментариев не может быть пустым")//указывает, что список comments должен содержать как
    // минимум один элемент.
    private List<Comment> results;

    public ResponseWrapperComment() {
    }

    public ResponseWrapperComment(int count, List<Comment> results) {
        this.count = count;
        this.results = results;
    }
}
