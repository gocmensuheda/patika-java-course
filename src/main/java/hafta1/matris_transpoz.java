package hafta1;

public class matris_transpoz {
    public static void main(String[] args) {
        int[][] matris={
                {1,2,3},
                {4,5,6},
                {7,8,9}

        };
        int[][] transpoz = new int[matris[0].length][matris.length];
        //burda transpoz matrisini oluşturdum.
        //matris[0].length bu ifade matrisin ilk satırındaki eleman sayısını ifade ediyor.
        //transpoz sonrası satırdaki eleman sayısı yani sütun sayısı satır sayısı olacağı için
        //yeni matrisin satır sayısını bununla belirledik. matris.lenght ise satır sayısını ifade eder.
        //yeni matrisimiz için ise sütun sayısı olacaktır.

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                transpoz[i][j]=matris[j][i];
                //burda transpoz işlemi yapılıyor. satırlar ve sütunlar yer değiştiriyor.

            }
        }
        for (int i = 0; i < transpoz.length; i++) {
            for (int j = 0; j < transpoz[i].length; j++) {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }
    }


}