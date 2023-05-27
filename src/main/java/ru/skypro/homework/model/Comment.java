package ru.skypro.homework.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Data
@Table(name = "comment")
public class Comment {

    @Id
    private Integer id;
    private int author;
    private String authorImage;
    private String authorFirstName;
    private long createdAt;
    private int pk;

    @NotBlank
    @Size(max = 200)
    private String text;



    public Comment() {
    }

    public Comment(int author, String authorImage, String authorFirstName, long createdAt, int pk, String text) {
        this.author = author;
        this.authorImage = authorImage;
        this.authorFirstName = authorFirstName;
        this.createdAt = createdAt;
        this.pk = pk;
        this.text = text;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public String getAuthorImage() {
        return authorImage;
    }

    public void setAuthorImage(String authorImage) {
        this.authorImage = authorImage;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
        Comment comment = (Comment) o;
        return author == comment.author && createdAt == comment.createdAt && pk == comment.pk && id.equals(comment.id) && authorImage.equals(comment.authorImage) && authorFirstName.equals(comment.authorFirstName) && text.equals(comment.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, authorImage, authorFirstName, createdAt, pk, text);
    }
    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", author=" + author +
                ", authorImage='" + authorImage + '\'' +
                ", authorFirstName='" + authorFirstName + '\'' +
                ", createdAt=" + createdAt +
                ", pk=" + pk +
                ", text='" + text + '\'' +
                '}';
    }

}
