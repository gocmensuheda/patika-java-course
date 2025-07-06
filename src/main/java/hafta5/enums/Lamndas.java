package hafta5.enums;

import java.util.Arrays;
import java.util.List;

public class Lamndas {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Sayıları iki katına çıkarıp yazdırma (Lambda ve Stream API ile)
        numbers.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);
}
