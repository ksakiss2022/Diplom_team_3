package ru.skypro.homework.model;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class ResponseWrapperComment {
    @Positive(message = "Значение count должно быть положительным")
    private int count;

    @Valid
    @NotNull(message = "Список комментариев не может быть пустым")
    private List<Comment> results;

    public ResponseWrapperComment() {
    }

    public ResponseWrapperComment(int count, List<Comment> results) {
        this.count = count;
        this.results = results;
    }
}
