package ru.skypro.homework.controller;


import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Файл BasicAuthCorsFilter.java содержит реализацию фильтра OncePerRequestFilter, который выполняет обработку всех
 * HTTP запросов, проходящих через приложение.
 *
 * Цель этого фильтра - добавление заголовка Access-Control-Allow-Credentials в ответ на запросы к серверу.
 * Это необходимо для выполнения кросс-доменных запросов с использованием AJAX, когда клиент находится на другом
 * домене, чем сервер API.
 */
@Component//что указывает Spring на необходимость создания экземпляра данного класса в контейнере приложения.
public class BasicAuthCorsFilter extends OncePerRequestFilter {


    //Метод doFilterInternal фильтра вызывается для каждого запроса и добавляет заголовок
    // "Access-Control-Allow-Credentials" со значением "true".
    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest,
                                    HttpServletResponse httpServletResponse,
                                    FilterChain filterChain)
            throws ServletException, IOException {
        httpServletResponse.addHeader("Access-Control-Allow-Credentials", "true");
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }

    //Данный фильтр является один раз выполняемым, то есть он будет вызываться один раз для каждого HTTP запроса
}
