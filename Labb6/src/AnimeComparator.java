import java.util.Comparator;

public class AnimeComparator implements Comparator<Anime> {
    @Override
    public int compare(Anime anime1, Anime anime2) {
        return anime1.getAnime().compareTo(anime2.getAnime());
    }
}
