package ru.skypro.homework.dto;

import lombok.Data;

/**
 * Класс FullAdsDto содержит поля для хранения информации об объявлениях Ads, такие как идентификатор, имя и фамилия
 * автора, описание, адрес электронной почты, изображение, телефон, цена и заголовок.
 */
@Data// добавляет методы getter и setter для каждого поля класса, а также методы toString, equals и hashCode.
public class FullAdsDto {
    private int pk;
    private String authorFirstName;
    private String authorLastName;
    private String description;
    private String email;
    private String image;
    private String phone;
    private int price;
    private String title;

}
