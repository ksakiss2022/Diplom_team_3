package ru.skypro.homework.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;
import java.util.Objects;
/**
 В классе `Ads`(Объявления) определены конструкторы для создания объектов класса,а также методы геттеров и сеттеров для доступа
 к полям. Методы `equals()`, `hashCode()` и `toString()` вызываются при сравнении, хешировании и преобразовании
 объекта в строку.
 */
@Entity//Аннотация `@Entity` используется в JPA-сущностях для обозначения, что класс представляет собой таблицу в базе данных.
@Data//Аннотация `@Data` автоматически создает все необходимые методы геттеров, сеттеров, методы сравнения и хеширования, а также метод toString().
@Table(name = "ads")// - аннотация определяет имя таблицы в базе данных.
public class Ads {
    @Id
    private Integer id;
    @NotNull// для значения, которое не может быть null,
    @Min(1)// для минимального значения, которое может принимать поле
    private Integer pk;

    @NotNull//для значения, которое не может быть null,
    @Min(1)//для минимального значения, которое может принимать поле
    private Integer author;

    @NotBlank//для значения, которое не должно быть пустой строкой
    @Size(max = 100)// для проверки размера строки,
    private String title;

    @NotNull// для значения, которое не может быть null,
    @Positive//для положительного значения
    private Integer price;

    @NotBlank//для значения, которое не должно быть пустой строкой
    @Size(max = 500)// / для проверки размера строки,
    private String image;

    public Ads(Integer pk, Integer author, String title, Integer price, String image) {
        this.pk = pk;
        this.author = author;
        this.title = title;
        this.price = price;
        this.image = image;
    }

    public Ads() {

    }

}
