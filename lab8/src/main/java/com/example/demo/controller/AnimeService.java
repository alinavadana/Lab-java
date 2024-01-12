package com.example.demo.controller;

import com.example.demo.model.Anime; // Change the import to your Anime model
import com.example.demo.service.AnimeService; // Change the import to your AnimeService
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/anime")
public class AnimeController {
    private final AnimeService animeService;

    public AnimeController(AnimeService animeService) {
        this.animeService = animeService;
    }

    @GetMapping
    public List<Anime> getAllAnime() {
        return animeService.getAllAnime();
    }

    @GetMapping("/{title}")
    public Anime getAnimeByTitle(@PathVariable String title) {
        return animeService.getAnimeByTitle(title);
    }

    @PostMapping("/upload")
    public void addAnime(@RequestBody List<Anime> animeList) {
        animeService.addAnime(animeList);
    }

    @DeleteMapping("/{title}")
    public void deleteAnimeByTitle(@PathVariable String title) {
        animeService.deleteAnimeByTitle(title);
    }

    @PutMapping("/{title}")
    public void updateAnime(@PathVariable String title,
                            @RequestParam String columnName,
                            @RequestParam String columnValue) {
        animeService.updateAnime(title, columnName, columnValue);
    }
}
