package ru.skypro.homework.repository;

import org.springframework.stereotype.Repository;
import ru.skypro.homework.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * В интерфейсе UserRepository определены методы для поиска пользователей по различным критериям, таким как Id,
 * имя, фамилия, электронная почта, изображение и телефонный номер.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserById(Integer id);

    User findUserByFirstNameContainsIgnoreCase(String firstName);

    User findUserByLastNameContainingIgnoreCase(String lastName);

    User findUserByEmail(String email);

    User findUserByImage(String image);

    User findUserByPhone(String phone);


}
