package ru.skypro.homework.dto;

import lombok.Data;

/**
 * Класс CreateAdsDto содержит поля для хранения информации об объявлениях Ads, такие как описание, цена и заголовок.
 */
@Data//добавляет методы getter и setter для каждого поля класса, а также методы toString, equals и hashCode.
public class CreateAdsDto {
    private String description;
    private int price;
    private String title;
}
