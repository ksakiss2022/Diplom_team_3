package ru.skypro.homework.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;
/**
 Класс FullAds является сущностью, которая представляет данные об объявлении.
 */
@Entity// аннотация  указывает на то, что этот класс является сущностью.
@Data//аннотация  позволяет сгенерировать геттеры, сеттеры, методы equals и hashCode.
@Table(name = "fullAds")//указывает на имя таблицы в базе данных, связанной с этой сущностью.
public class FullAds {
    @Id// указывает, что поле id является идентификатором сущности.
    private Integer id;
    private int pk;
    private String authorFirstName;
    private String authorLastName;
    private String description;
    private String email;
    private String image;
    private String phone;
    private int price;
    private String title;



    public FullAds() {
    }

    public FullAds(int pk, String authorFirstName, String authorLastName, String description, String email, String image, String phone, int price, String title) {
        this.pk = pk;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.description = description;
        this.email = email;
        this.image = image;
        this.phone = phone;
        this.price = price;
        this.title = title;
    }


}
