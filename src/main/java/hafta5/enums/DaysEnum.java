package hafta5.enums;

import java.util.Scanner;

public enum DaysEnum {

    SUNDAY("non"),

    MONDAY("9:00 - 17:00"),

    TUESDAY("9:00 - 17:00"),

    WEDNESDAY("9:00 - 10:00"),

    THURSDAY("9:00 - 17:00"),

    FRIDAY("9:00 - 16:00"),

    SATURDAY("9:00 - 12:00");

    private final String hour;

    DaysEnum(String hour) {
        this.hour = hour;
    }

    public String getHour() {
        return hour;
    }

    public static void main(String[] args) {
        for (DaysEnum days: DaysEnum.values()){
            System.out.println(days.ordinal()+ " " + days.name());
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen saaitini öğrenmek istediğiniz günün numarasını giriniz.");
        int Day = scanner.nextInt();

        switch (Day){
            case 0:
                System.out.println(DaysEnum.SUNDAY.getHour());
                break;
            case 1:
                System.out.println(DaysEnum.MONDAY.getHour());
                break;
            case 2:
                System.out.println(DaysEnum.TUESDAY.getHour());
                break;
            case 3:
                System.out.println(DaysEnum.WEDNESDAY.getHour());
                break;
            case 4:
                System.out.println(DaysEnum.THURSDAY.getHour());
                break;
            case 5:
                System.out.println(DaysEnum.FRIDAY.getHour());
                break;
            case 6:
                System.out.println(DaysEnum.SATURDAY.getHour());
                break;
            default:
                System.out.println("lütfen geçerli bir seçim yapınız.");

        }

    }
}
