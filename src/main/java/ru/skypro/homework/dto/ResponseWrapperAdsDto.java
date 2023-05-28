package ru.skypro.homework.dto;

import lombok.Data;
import ru.skypro.homework.model.Ads;

import java.util.List;

/**
 * Класс ResponseWrapperAdsDto используется для обертывания списка объявлений Ads в ответ на запрос,
 * включая количество объявлений в списке.
 */
@Data// добавляет методы getter и setter для каждого поля класса, а также методы toString, equals и hashCode.
public class ResponseWrapperAdsDto {


    private int count; //Поле count содержит количество объявлений,


    private List<Ads> results;// список объектов Ads, которые содержат информацию об отдельных объявлениях.

}
