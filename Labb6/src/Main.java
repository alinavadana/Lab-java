import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Alina\\Desktop\\Tema Lab 1\\Labb6\\src";

        try {
            List<Anime> animeList = CsvReader.readAnimesFromCSV(filePath);


            Collections.sort(animeList);
            System.out.println("Sortare utilizând Comparable:");
            printAnimeList(animeList);


            AnimeComparator animeComparator = new AnimeComparator();
            Collections.sort(animeList, animeComparator);
            System.out.println("\nSortare utilizând Comparator:");
            printAnimeList(animeList);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printAnimeList(List<Anime> animeList) {
        for (Anime anime : animeList) {
            System.out.println(anime);
        }
    }
}
