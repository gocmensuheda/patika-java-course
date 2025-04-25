package hafta3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class YakinSayilar {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(10);
        ArrayList<Integer> sonuclar = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

            Random random = new Random();
            int randomNumber = random.nextInt(91) + 10; //10 ile 100 arasında rastgele pozitif tam sayı üretiyor.
            numbers.add(randomNumber);

        }
        Collections.sort(numbers); // sayıları küçükten büyüğe sıraladık.
        int minFark = 89; // listedeki sayılar 10 ile 100 arasında olduğu için en büyük fark 89 olur. bu yüzden 89 ile başlatıp en küçüğe ulaşmaya çalışacağız.
        int yakin1 = 0;
        int yakin2 = 0;

        for (int i = 0; i < numbers.size()-1; i++) { // i+1 olunca liste sınırı aşılacağı için üst sınırı böyle belirledim.
            int fark = numbers.get(i+1)-numbers.get(i);// kendinden bir sonraki elemanla fark alınıyor.
            if(fark<minFark){
                minFark=fark;
                yakin1=numbers.get(i+1);
                yakin2=numbers.get(i);
            }

        }

        System.out.println("1.sayı: "+ yakin1 + " 2. sayı: " + yakin2);






    }
}
