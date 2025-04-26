package hafta3.Film;

import java.util.*;

import static hafta3.Film.Film.filmFiltrele;

public class main {
    public static void main(String[] args) {
        ArrayList<Film> filmler = new ArrayList<>();

        // 5 farklı film nesnesi oluşturuluyor
        filmler.add(new Film("Interstellar", 2014, "Bilim Kurgu", 8.6));
        filmler.add(new Film("Fight Club", 1999, "Dram", 8.7));
        filmler.add(new Film("The Dark Knight", 2008, "Aksiyon", 9.0));
        filmler.add(new Film("Inception", 2010, "Bilim Kurgu", 8.8));
        filmler.add(new Film("Avatar", 2009, "Bilim Kurgu", 7.8));

        //  IMDb puanına göre büyükten küçüğe sıralama
        filmler.sort(Comparator.comparingDouble(Film::getImdp).reversed());
        System.out.println("\n IMDb Puanına Göre Büyükten Küçüğe Sıralı Filmler:");
        for (Film film : filmler) {
            System.out.println(film);
        }

        //  Yayın yılına göre küçükten büyüğe sıralama
        filmler.sort(Comparator.comparingInt(Film::getYil));
        System.out.println("\n Yayın Yılına Göre Küçükten Büyüğe Sıralı Filmler:");
        for (Film film : filmler) {
            System.out.println(film);
        }

        String hedefTur = "Bilim Kurgu";
        List<Film> filtrelenmisFilmler = filmFiltrele(filmler, hedefTur);

        //  Filtrelenmiş filmleri ekrana yazdır
        System.out.println("\n " + hedefTur + " Türüne Göre Filtrelenmiş Filmler:");
        for (Film film : filtrelenmisFilmler) {
            System.out.println(film);
        }










    }


}
