package ru.skypro.homework.repository;

import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skypro.homework.model.Ads;

import javax.persistence.metamodel.SingularAttribute;
import java.io.Serializable;
/**
 *данный интерфейс AdsRepository позволяет получать доступ к данным о рекламных объявлениях,
 *хранящимся в базе данных, и выполнять поиск с помощью различных критериев.
 * Он наследуется от интерфейса JpaRepository, который предоставляет функциональность CRUD (Create, Read, Update,
 * Delete) для сущностей. По умолчанию, JpaRepository работает с сущностями, которые реализуют интерфейс Serializable
 * и имеют первичный ключ типа Long.
 */

@Repository//указывает, что интерфейс AdsRepository является репозиторием
public interface AdsRepository extends JpaRepository<Ads, Long> {

    Ads findAdsById(SingularAttribute<AbstractPersistable, Serializable> id);

    Ads findAdsByImage(String image);

    Ads findAdsByPrice(double price);

    Ads findAdsByTitleContainingIgnoreCase(String title);

}
