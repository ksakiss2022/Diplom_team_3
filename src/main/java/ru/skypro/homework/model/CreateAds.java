package ru.skypro.homework.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.util.Objects;
/**
 Класс CreateAds описывает данные о новом объявлении.
 */
@Data
public class CreateAds {
    @NotBlank //анотация сообщает, что поле должно быть непустым
    @Size(max = 100)//аннотация указывает на максимальное количество символов в строке.
    private String description;

    @Positive//аннотация  гарантирует, что поле price должно быть положительным числом.
    private int price;

    @NotBlank //анотация сообщает, что поле должно быть непустым
    @Size(max = 50)// аннотация указывает на максимальное количество символов в строке.
    private String title;



    public CreateAds(String description, int price, String title) {
        this.description = description;
        this.price = price;
        this.title = title;
    }

}
