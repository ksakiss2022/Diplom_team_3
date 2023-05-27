package ru.skypro.homework.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

public class CreateComment {


    @NotBlank
    @Size(max = 200)
    private String text;

     public CreateComment() {
    }

    public CreateComment(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateComment that = (CreateComment) o;
        return Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        return "CreateComment{" +
                "text='" + text + '\'' +
                '}';
    }

}
