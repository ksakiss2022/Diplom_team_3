package ru.skypro.homework.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.NewPasswordDto;
import ru.skypro.homework.model.User;
import ru.skypro.homework.service.UserService;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.http.HttpStatus;

import ru.skypro.homework.dto.UserDto;

@RestController
@RequestMapping("/users")
@CrossOrigin(value = "http://localhost:3000")
public class UserController {
    private final UserService userService;

    private PasswordEncoder passwordEncoder;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Operation(
            operationId = "setPassword",
            summary = "Обновление пароля",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "OK",
                            content = @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    array = @ArraySchema(schema = @Schema(implementation = User.class))
                            )),
                    @ApiResponse(responseCode = "401", description = "Unauthorized"),
                    @ApiResponse(responseCode = "403", description = "Forbidden")
            }, tags = "Пользователи")

    @PostMapping("/users/set_password")
    public ResponseEntity<String> setPassword(@RequestBody NewPasswordDto newPassword, Authentication authentication) {

        return new ResponseEntity<>(HttpStatus.OK);
    }


    @Operation(
            operationId = "getUser",
            summary = "Получить информацию об авторизованном пользователе",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "OK",
                            content = @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    array = @ArraySchema(schema = @Schema(implementation = UserDto.class))
                            )),
                    @ApiResponse(responseCode = "401", description = "Unauthorized"),
            }, tags = "Пользователи")

    @GetMapping("/users/me")
    public ResponseEntity<UserDto> getUser(Authentication authentication) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Operation(
            operationId = "updateUser",
            summary = "Обновить информацию об авторизованном пользователе",
            tags = {"Пользователи"},
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "OK",
                            content = @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    array = @ArraySchema(schema = @Schema(implementation = UserDto.class))
                            )),
                    @ApiResponse(responseCode = "401", description = "Unauthorized"),
            }
    )
    @PatchMapping("/users")
    public ResponseEntity<UserDto> updateUser(@RequestBody UserDto user, Authentication authentication) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Operation(
            operationId = "updateUserImage",
            summary = "Обновить аватар авторизованного пользователя",
            tags = {"Пользователи"},
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "OK",
                            content = @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    array = @ArraySchema(schema = @Schema(implementation = UserDto.class))
                            )),
                    @ApiResponse(responseCode = "401", description = "Unauthorized"),
            }
    )
    @PatchMapping(value = "/users/me/image", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Void> updateUserImage(@RequestParam("image") MultipartFile image, Authentication authentication) {
        return ResponseEntity.status(200).build();
    }
}
