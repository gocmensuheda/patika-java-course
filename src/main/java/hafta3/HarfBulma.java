package hafta3;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HarfBulma {
    public static void main(String[] args) {
        ArrayList<String> harfler = new ArrayList<>(4);
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // 4 rastgele harf üret ve listeye ekle
        for (int i = 0; i < 4; i++) {
            char rastgeleHarf = (char) (random.nextInt(26) + 'A');
            harfler.add(String.valueOf(rastgeleHarf));
        }

        System.out.println("Harf listeniz: " + harfler);

        // Kullanıcıdan harf alımı işlemi (DÖNGÜNÜN DIŞINA ALINDI!)
        System.out.print("Lütfen bir harf giriniz: ");
        String kullanicidanAlinanHarf = scanner.nextLine().toUpperCase(); // Büyük harf olarak al

        boolean bulundu = false;

        // Listeyi kontrol et
        for (int i = 0; i < harfler.size(); i++) {
            if (harfler.get(i).equals(kullanicidanAlinanHarf)) { // Eğer harf listede varsa
                harfler.set(i, "found"); // İlgili elemanı "found" ile değiştir
                bulundu = true;
                break;
            }
        }

        // Eğer harf bulunmadıysa, listeye ekle
        if (!bulundu) {
            harfler.add(kullanicidanAlinanHarf);
        }

        System.out.println("Güncellenmiş Harf Listesi: " + harfler);
    }
}

