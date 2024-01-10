import java.util.ArrayList;
import java.util.List;

class AnimeServiceRunnable implements Runnable {
    private List<Anime> animeList;

    public AnimeServiceRunnable() {
        this.animeList = new ArrayList<>();
    }

    public List<Anime> getAnimeList() {
        return animeList;
    }

    @Override
    public void run() {
        // Simularea citirii sau adăugării datelor anime
        animeList.add(new Anime("Attack on Titan", "Action", 75));
        animeList.add(new Anime("One Punch Man", "Action/Comedy", 24));
        animeList.add(new Anime("My Hero Academia", "Action", 113));
    }
}
