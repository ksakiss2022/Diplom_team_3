package ru.skypro.homework.repository;

import ru.skypro.homework.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserById(Integer id);

    User findUserByFirstNameContainsIgnoreCase(String firstName);

    User findUserByLastNameContainingIgnoreCase(String lastName);

    User findUserByEmail(String email);

    User findUserByImage(String image);

    User findUserByPhone(String phone);


}
