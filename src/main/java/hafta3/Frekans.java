package hafta3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frekans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz: ");
        String kelime = scanner.nextLine();

        Map<Character, Integer> frekansMap = new HashMap<>();

        for (char c : kelime.toCharArray()) { // Kelimeyi karakter dizisine çeviriyoruz
            if (Character.isLetter(c)) { // Sadece harfleri dikkate alıyoruz
                if (frekansMap.containsKey(c)) {
                    frekansMap.put(c, frekansMap.get(c) + 1); // Eğer harf daha önce eklenmişse artır
                } else {
                    frekansMap.put(c, 1); // Eğer yoksa 1 ile başlat
                }
            }
        }

        // Sonuçları ekrana yazdırıyoruz
        for (Map.Entry<Character, Integer> entry : frekansMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        scanner.close();
    }
}
