package ru.skypro.homework.model;


import lombok.Data;

import java.util.List;
import java.util.Objects;
/**
 Класс ResponseWrapperAds предназначен для обертывания ответа API. Он содержит в себе два поля: целочисленное поле
 count и список объявлений results.
 */
@Data
public class ResponseWrapperAds {

    private int count;
    private List<Ads> results;



    public ResponseWrapperAds() {
    }

    public ResponseWrapperAds(int count, List<Ads> results) {
        this.count = count;
        this.results = results;
    }

}
