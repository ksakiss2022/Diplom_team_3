package ru.skypro.homework.repository;

import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.skypro.homework.model.Ads;

import javax.persistence.metamodel.SingularAttribute;
import java.io.Serializable;

public interface AdsRepository extends JpaRepository<Ads, Long> {

    Ads findAdsById(SingularAttribute<AbstractPersistable, Serializable> id);

    Ads findAdsByImage(String image);

    Ads findAdsByPrice(double price);

    Ads findAdsByTitleContainingIgnoreCase(String title);

}
