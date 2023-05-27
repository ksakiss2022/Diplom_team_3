package ru.skypro.homework.repository;

import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.skypro.homework.model.Comment;

import javax.persistence.metamodel.SingularAttribute;
import java.io.Serializable;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

    Comment findCommentById (SingularAttribute<AbstractPersistable, Serializable> Id);
    Comment findCommentByAuthor (int author);

    Comment findCommentByAuthorImageContainsIgnoreCase (String authorImage);
    Comment findCommentByAuthorFirstNameContainsIgnoreCase (String authorFirstName);

}
