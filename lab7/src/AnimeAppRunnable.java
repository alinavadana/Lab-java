import java.util.List;

public class AnimeAppRunnable {
    public static void main(String[] args) {
        AnimeServiceRunnable animeServiceRunnable = new AnimeServiceRunnable();
        Thread animeThread = new Thread(animeServiceRunnable);
        animeThread.start();

        try {
            animeThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<Anime> animeList = animeServiceRunnable.getAnimeList();
        for (Anime anime : animeList) {
            System.out.println(anime);
        }
    }
}