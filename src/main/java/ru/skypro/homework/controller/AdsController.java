package ru.skypro.homework.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.AdsDto;
import ru.skypro.homework.model.Ads;

import java.io.IOException;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@RestController
@RequestMapping("/ads")
@CrossOrigin(value = "http://localhost:3000")
public class AdsController {

    @Operation(
            operationId = "getAllAds",
            summary = "Получить все объявления",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "OK",
                            content = @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    array = @ArraySchema(schema = @Schema(implementation = AdsDto.class))
                            )),
                    @ApiResponse(responseCode = "401", description = "Unauthorized")
            }, tags = "Объявления")
    @GetMapping("/ads")
    public ResponseEntity<List<AdsDto>> getAllAds() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Operation(
            operationId = "addAd",
            summary = "Добавить объявление",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "OK",
                            content = @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    array = @ArraySchema(schema = @Schema(implementation = AdsDto.class))
                            )),
                    @ApiResponse(responseCode = "401", description = "Unauthorized")
            }, tags = "Объявления")
    @PostMapping
    public ResponseEntity<AdsDto> addAd(@RequestBody Ads ads) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Operation(
            operationId = "getAds",
            summary = "Получить информацию об объявлении",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "OK",
                            content = @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    array = @ArraySchema(schema = @Schema(implementation = AdsDto.class))
                            )),
                    @ApiResponse(responseCode = "401", description = "Unauthorized")
            }, tags = "Объявления")
    @GetMapping("/ads/{id}")
    public ResponseEntity<AdsDto> getAds(@Parameter(description = "Id объявления") @PathVariable Long id) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Operation(
            operationId = "removeAd",
            summary = "Удалить объявление",
            responses = {
                    @ApiResponse(responseCode = "204", description = "No Content"),
                    @ApiResponse(responseCode = "401", description = "Unauthorized"),
                    @ApiResponse(responseCode = "403", description = "Forbidden"),
            }, tags = "Объявления")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeAd(@Parameter(description = "Id объявления") @PathVariable Long id) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Operation(
            operationId = "updateAds",
            summary = "Обновить информацию об объявлении",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "OK",
                            content = @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    array = @ArraySchema(schema = @Schema(implementation = AdsDto.class))
                            )),
                    @ApiResponse(responseCode = "401", description = "Unauthorized"),
                    @ApiResponse(responseCode = "403", description = "Forbidden")
            }, tags = "Объявления")
    @PatchMapping("/{id}")
    public ResponseEntity<AdsDto> updateAds(@RequestBody Ads ads, @PathVariable Integer id) {
        return ResponseEntity.ok().build();
    }

    @Operation(
            operationId = "getAdsMe",
            summary = "Получить объявления авторизованного пользователя",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "OK",
                            content = @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    array = @ArraySchema(schema = @Schema(implementation = AdsDto.class))
                            )),
                    @ApiResponse(responseCode = "401", description = "Unauthorized"),
            }, tags = "Объявления")
    @GetMapping("/ads/me")
    public ResponseEntity<AdsDto> getAdsMe() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Operation(
            operationId = "updateImage",
            summary = "Обновить картинку объявления",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "OK",
                            content = @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    array = @ArraySchema(schema = @Schema(implementation = AdsDto.class))
                            )),
                    @ApiResponse(responseCode = "401", description = "Unauthorized"),
                    @ApiResponse(responseCode = "403", description = "Forbidden")
            }, tags = "Объявления")

    @PatchMapping
    public ResponseEntity<byte[]> updateImage(
            @PathVariable @Positive(message = "ID объявления должен быть положительным числом") Integer id,
            @NotNull(message = "Файл изображения не может быть пустым") @RequestParam("image") MultipartFile image)
            throws IOException {
        // Логика обработки запроса на обновление картинки объявления
        // с использованием id и MultipartFile image
        // Возвращаем ответ с обновленным изображением в виде массива байтов
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(image.getBytes());
    }
}
