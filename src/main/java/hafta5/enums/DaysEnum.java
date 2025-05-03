package hafta5.enums;

public enum DaysEnum {

    SUNDAY("non"),

    MONDAY("9:00 - 17:00"),

    TUESDAY("9:00 - 17:00"),

    WEDNESDAY("9:00 - 17:00"),

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
            System.out.println(days.name()+" " + days.getHour());
        }

    }
}
