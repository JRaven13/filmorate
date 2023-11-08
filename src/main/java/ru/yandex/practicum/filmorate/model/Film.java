package ru.yandex.practicum.filmorate.model;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class Film {
    int id;
    String name;
    String description;
    LocalDate releaseDate;
    LocalTime duration;
}
