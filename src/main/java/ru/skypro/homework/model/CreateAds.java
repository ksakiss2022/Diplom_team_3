package ru.skypro.homework.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.util.Objects;

public class CreateAds {
    @NotBlank
    @Size(max = 100)
    private String description;

    @Positive
    private int price;

    @NotBlank
    @Size(max = 50)
    private String title;



    public CreateAds(String description, int price, String title) {
        this.description = description;
        this.price = price;
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateAds createAds = (CreateAds) o;
        return price == createAds.price && description.equals(createAds.description) && title.equals(createAds.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, price, title);
    }
    @Override
    public String toString() {
        return "CreateAds{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", title='" + title + '\'' +
                '}';
    }

}
