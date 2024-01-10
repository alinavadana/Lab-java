import java.util.Objects;

public class Anime implements Comparable<Anime> {
    private String anime;
    private String releaseDate;
    private int length;
    private String genre;
    private double rating;

    public Anime() {
        // Constructor gol
    }

    public Anime(String anime, String releaseDate, int length, String genre, double rating) {
        this.anime = anime;
        this.releaseDate = releaseDate;
        this.length = length;
        this.genre = genre;
        this.rating = rating;
    }

    public String getAnime() {
        return anime;
    }

    public void setAnime(String anime) {
        this.anime = anime;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public int compareTo(Anime other) {
        return this.anime.compareTo(other.anime);
    }

    @Override
    public String toString() {
        return "Anime{" +
                "anime='" + anime + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", length=" + length +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }
}
