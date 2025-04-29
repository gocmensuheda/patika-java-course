package hafta3;

public class GenericOdev {
    public static <T> void printArray(T[] array){ //generic method tanımı yapıyoruz.
        for (T element : array){
            System.out.println(element);
        }

    }

    public static void main(String[] args) {
        Integer array1[] = {1,2,3};
        String array2[] = {"java","generics","ödev"};
        printArray(array1);
        printArray(array2);
    }
}
