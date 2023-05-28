package ru.skypro.homework.dto;

import lombok.Data;
/**
 * Класс AdsDto содержит поля для хранения информации об объявлениях Ads, такие как идентификатор, идентификатор
 * создателя, заголовок, цена и изображение.
 */

@Data//позволяет автоматически создать методы getter и setter, а также методы toString, equals и hashCode для класса
// AdsDto, а также некоторые другие методы, такие как методы для сравнения двух объектов по значениям и нахождения хэш-кода.
public class AdsDto {
    private Integer id;
    private Integer pk;
    private Integer author;
    private String title;
    private Integer price;
    private String image;

}
