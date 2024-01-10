import java.util.List;

public class AnimeAppThread {
    public static void main(String[] args) {
        AnimeServiceThread animeServiceThread = new AnimeServiceThread();
        animeServiceThread.start();

        try {
            animeServiceThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<Anime> animeList = animeServiceThread.getAnimeList();
        for (Anime anime : animeList) {
            System.out.println(anime);
        }
    }
}