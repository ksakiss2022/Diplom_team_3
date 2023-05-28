package ru.skypro.homework.repository;

import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skypro.homework.model.Comment;

import javax.persistence.metamodel.SingularAttribute;
import java.io.Serializable;

/**
 * В интерфейсе CommentRepository определены методы для поиска комментариев по различным критериям, таким как Id, автор
 * комментария и изображение автора. Также определен метод для поиска комментариев по частичному совпадению имени автора.
 */
@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

    Comment findCommentById (SingularAttribute<AbstractPersistable, Serializable> Id);
    Comment findCommentByAuthor (int author);

    Comment findCommentByAuthorImageContainsIgnoreCase (String authorImage);
    Comment findCommentByAuthorFirstNameContainsIgnoreCase (String authorFirstName);

}
