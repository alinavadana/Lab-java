import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    public static List<Anime> readAnimesFromCSV(String filePath) throws IOException {
        List<Anime> animeList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                Anime anime = new Anime();
                anime.setAnime(data[0]);
                anime.setReleaseDate(data[1]);
                anime.setLength(Integer.parseInt(data[2]));
                anime.setGenre(data[3]);
                anime.setRating(Double.parseDouble(data[4]));
                animeList.add(anime);
            }
        }

        return animeList;
    }
}
