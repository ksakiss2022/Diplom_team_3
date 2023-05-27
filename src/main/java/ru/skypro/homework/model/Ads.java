package ru.skypro.homework.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;
import java.util.Objects;

@Entity
@Data
@Table(name = "ads")
public class Ads {
    @Id
    private Integer id;
    @NotNull
    @Min(1)
    private Integer pk;

    @NotNull
    @Min(1)
    private Integer author;

    @NotBlank
    @Size(max = 100)
    private String title;

    @NotNull
    @Positive
    private Integer price;

    @NotBlank
    @Size(max = 500)
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

    public Integer getPk() {
        return pk;
    }

    public void setPk(Integer pk) {
        this.pk = pk;
    }

    public Integer getAuthor() {
        return author;
    }

    public void setAuthor(Integer author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ads ads = (Ads) o;
        return id.equals(ads.id) && pk.equals(ads.pk) && author.equals(ads.author) && title.equals(ads.title) && price.equals(ads.price) && image.equals(ads.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pk, author, title, price, image);
    }

    @Override
    public String toString() {
        return "Ads{" +
                "id=" + id +
                ", pk=" + pk +
                ", author=" + author +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                '}';
    }
}
