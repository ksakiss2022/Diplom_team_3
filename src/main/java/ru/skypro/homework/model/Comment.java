package ru.skypro.homework.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;
/**
 В классе `Comment`(Коментарий) определены конструкторы для создания объектов класса,а также методы геттеров и сеттеров для доступа
 к полям. Методы `equals()`, `hashCode()` и `toString()` вызываются при сравнении, хешировании и преобразовании
 объекта в строку.
 */
@Entity
@Data//позволяет сгенерировать геттеры, сеттеры, методы equals и hashCode.
@Table(name = "comment")// указывает на имя таблицы в базе данных, связанной с этой сущностью.
public class Comment {

    @Id//указывает, что поле id является идентификатором сущности.
    private Integer id;
    private int author;
    private String authorImage;
    private String authorFirstName;
    private long createdAt;
    private int pk;

    @NotBlank
    @Size(max = 200)
    private String text;//У поля text есть дополнительные ограничения, заданные аннотациями @NotBlank и @Size.
    // Это означает, что поле не может быть пустым и не может содержать более 200 символов.



    public Comment() {
    }

    public Comment(int author, String authorImage, String authorFirstName, long createdAt, int pk, String text) {
        this.author = author;
        this.authorImage = authorImage;
        this.authorFirstName = authorFirstName;
        this.createdAt = createdAt;
        this.pk = pk;
        this.text = text;
    }

}
