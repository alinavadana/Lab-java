import java.util.ArrayList;
import java.util.List;

class AnimeServiceThread extends Thread {
    private List<Anime> animeList;

    public AnimeServiceThread() {
        this.animeList = new ArrayList<>();
    }

    public List<Anime> getAnimeList() {
        return animeList;
    }

    @Override
    public void run() {
        // Simularea citirii sau adăugării datelor anime
        animeList.add(new Anime("Naruto", "Action/Adventure", 220));
        animeList.add(new Anime("Death Note", "Mystery/Thriller", 37));
        animeList.add(new Anime("Fullmetal Alchemist: Brotherhood", "Action/Adventure", 64));
    }
}