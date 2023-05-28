package ru.skypro.homework.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.homework.dto.LoginReq;
import ru.skypro.homework.dto.RegisterReq;
import ru.skypro.homework.dto.Role;
import ru.skypro.homework.service.AuthService;

import static ru.skypro.homework.dto.Role.USER;

/**
 * Класс AuthController представляет собой Rest-контроллер, который содержит два метода для авторизации и регистрации
 * пользователей.
 */
@Slf4j//добавляет в класс поддержку логирования с использованием библиотеки SLF4J.
@CrossOrigin(value = "http://localhost:3000")//включает поддержку CORS на уровне контроллера, что позволяет принимать
// запросы из указанного источника (по адресу http://localhost:3000).
@RestController
@RequiredArgsConstructor// генерирует конструктор с аргументами и помечает поля, инициализируемые через конструктор,
// аннотацией @NonNull.
public class AuthController {

    private final AuthService authService;

    //    @PostMapping("/login")
//    public ResponseEntity<?> login(@RequestBody LoginReq req) {
//        if (authService.login(req.getUsername(), req.getPassword())) {
//            return ResponseEntity.ok().build();
//        } else {
//            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
//        }
//    }

    //Метод login является обработчиком POST-запроса на путь "/login" и принимает в качестве параметра объект LoginReq.
    // Возвращаемый тип ResponseEntity<?> означает, что в зависимости от результата выполнения запроса, сервер может
    // вернуть ответ с любым типом. Если пользователь с указанным логином и паролем был найден, метод возвращает
    // ResponseEntity с кодом 200 OK. Если пользователь не найден, метод вернет ответ с кодом 403 Forbidden.
    @Operation(
            operationId = "login",
            summary = "Авторизация пользователя",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "OK"),
                    @ApiResponse(responseCode = "401", description = "Unauthorized")
            }, tags = "Авторизация")
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginReq req) {
        if (authService.login(req.getUsername(), req.getPassword())) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }
    }


//
//    @PostMapping("/register")
//    public ResponseEntity<?> register(@RequestBody RegisterReq req) {
//        Role role = req.getRole() == null ? USER : req.getRole();
//        if (authService.register(req, role)) {
//            return ResponseEntity.ok().build();
//        } else {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//        }
//    }


    //Метод register также является обработчиком POST-запроса на путь "/register" и принимает объект RegisterReq.
    // В случае успешной регистрации пользователя метод возвращает ResponseEntity со статусом 200 OK.
    // Если при регистрации возникла ошибка, метод вернет ответ с кодом 400 Bad Request.
    @Operation(
            operationId = "register",
            summary = "Регистрация пользователя",
            responses = {
                    @ApiResponse(responseCode = "201", description = "Created"),

            }, tags = "Регистрация")
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterReq req) {
        Role role = req.getRole() == null ? USER : req.getRole();
        if (authService.register(req, role)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
