package hafta5.enums;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ahmet", "Ayşe", "Mehmet", "Zeynep");

        // Method reference ile liste elemanlarını yazdırma
        names.forEach(System.out::println);
    }
}
