package ru.skypro.homework.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Data
@Table(name = "fullAds")
public class FullAds {
    @Id
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

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
        FullAds fullAds = (FullAds) o;
        return pk == fullAds.pk && price == fullAds.price && id.equals(fullAds.id) && authorFirstName.equals(fullAds.authorFirstName) && authorLastName.equals(fullAds.authorLastName) && description.equals(fullAds.description) && email.equals(fullAds.email) && image.equals(fullAds.image) && phone.equals(fullAds.phone) && title.equals(fullAds.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pk, authorFirstName, authorLastName, description, email, image, phone, price, title);
    }
    @Override
    public String toString() {
        return "FullAds{" +
                "id=" + id +
                ", pk=" + pk +
                ", authorFirstName='" + authorFirstName + '\'' +
                ", authorLastName='" + authorLastName + '\'' +
                ", description='" + description + '\'' +
                ", email='" + email + '\'' +
                ", image='" + image + '\'' +
                ", phone='" + phone + '\'' +
                ", price=" + price +
                ", title='" + title + '\'' +
                '}';
    }
}
