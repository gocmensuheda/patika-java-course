package hafta3.Film;

import java.util.ArrayList;
import java.util.List;

public class Film {
    private String FilmAdi;
    private int yil;
    private String filmTuru;
    private double imdp;

    public Film(String filmAdi, int yil, String filmTuru, double imdp) {

        FilmAdi = filmAdi;
        this.yil = yil;
        this.filmTuru = filmTuru;
        this.imdp = imdp;
    }

    public int getYil() {
        return yil;
    }

    public String getFilmTuru() {
        return filmTuru;
    }

    public double getImdp() {
        return imdp;
    }

    public static List<Film> filmFiltrele(List<Film> filmler, String tur) {
        List<Film> filtrelenmisFilmler = new ArrayList<>();
        for (Film film : filmler) {
            if (film.getFilmTuru().equalsIgnoreCase(tur)) { // Büyük/küçük harf duyarlılığı kaldırıldı
                filtrelenmisFilmler.add(film);
            }
        }
        return filtrelenmisFilmler;
    }

    @Override
    public String toString() {
        return "Film{" +
                "FilmAdi='" + FilmAdi + '\'' +
                ", yil=" + yil +
                ", filmTuru='" + filmTuru + '\'' +
                ", imdp=" + imdp +
                '}';
    }


}
