package ru.skypro.homework.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;
/**
 Класс CreateComment содержит информацию о новом комментарии.
 */
@Data
public class CreateComment {


    @NotBlank// аннотация сообщает, что поле text не должно быть пустым.
    @Size(max = 200)//аннотация указывает на максимальное количество символов в строке.
    private String text;

     public CreateComment() {
    }

    public CreateComment(String text) {
        this.text = text;
    }

}
