package ru.skypro.homework.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 Аннотация @LoginReqProperty является пользовательской аннотацией. Аннотация может использоваться для пометки полей
 класса, которые необходимы для авторизации пользователя.
 */

//@Retention(RetentionPolicy.RUNTIME) указывает на то, что аннотация может использоваться во время выполнения программы.
@Retention(RetentionPolicy.RUNTIME)

//@Target(ElementType.FIELD) указывает на то, что аннотация может применяться только к полям классов.
@Target(ElementType.FIELD)

public @interface LoginReqProperty {
    String value() default "";// необязательное свойство, которое может быть использовано для задания значения по умолчанию для поля;

    String description();// обязательное свойство, которое описывает назначение поля, помеченного данной аннотацией.
}
