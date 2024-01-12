package com.example.demo.service;

import com.example.demo.model.Anime;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnimeService {
    private List<Anime> dataset;

    public AnimeService() {
        this.dataset = readDatasetFromCSV();
    }

    public List<Anime> getAllAnime() {
        return dataset;
    }

    public Anime getAnimeByTitle(String title) {
        return dataset.stream()
                .filter(anime -> anime.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .orElse(null);
    }

    public void addAnime(List<Anime> animeList) {
        dataset.addAll(animeList);
    }

    public void deleteAnimeByTitle(String title) {
        dataset.removeIf(anime -> anime.getTitle().equalsIgnoreCase(title));
    }

    public void updateAnime(String title, String columnName, String columnValue) {
        dataset.stream()
                .filter(anime -> anime.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .ifPresent(anime -> {
                    switch (columnName.toLowerCase()) {
                        case "releasedate":
                            anime.setReleaseDate(columnValue);
                            break;
                        case "length":
                            anime.setLength(columnValue);
                            break;
                        case "genre":
                            anime.setGenre(columnValue);
                            break;
                        case "rating":
                            anime.setRating(Double.parseDouble(columnValue));
                            break;
                        default:
                            // Handle unsupported column
                            break;
                    }
                });
    }

    private List<Anime> readDatasetFromCSV() {
        List<Anime> animeList = new ArrayList<>();
        Path path = Paths.get("src/main/resources/anime.csv");

        try {
            animeList = Files.lines(path)
                    .skip(1) // Skip header
                    .map(line -> {
                        String[] fields = line.split(",");
                        return new Anime(fields[0], fields[1], fields[2], fields[3], Double.parseDouble(fields[4]));
                    })
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return animeList;
    }
}
