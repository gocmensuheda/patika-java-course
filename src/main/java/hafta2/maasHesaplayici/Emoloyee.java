package hafta2.maasHesaplayici;

public class Emoloyee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Emoloyee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if(salary>1000){
            return (salary*3)/100;
        }
        else return 0;
    }

    public double bonus(){
        if (workHours>40){
            int bonus = (workHours-40)*30;
            return bonus;
        }
        else return 0;
    }

    public double raiseSalary() {
        int yil = 2021;
        double raiseSalary;
        if ((yil - hireYear) < 10) {
            return raiseSalary = (salary * 5) / 100;
        } else if ((yil - hireYear) > 9 && (yil - hireYear) < 20) {
            return raiseSalary = (salary * 10) / 100;
        } else if ((yil - hireYear) > 19) {
            return raiseSalary = (salary * 15) / 100;
        } else return 0;
    }

    public String toString() {
        return "Employee Details:\n" +
                "Name: " + name + "\n" + // Çalışanın adı ve soyadı
                "Salary: " + salary + "\n" + // Çalışanın maaşı
                "Work Hours per Week: " + workHours + "\n" + // Haftalık çalışma saati
                "Hire Year: " + hireYear + "\n" + // İşe başlangıç yılı
                "Tax: " + tax() + "\n" + // Hesaplanan vergi miktarı
                "Bonus: " + bonus() + "\n" + // Fazla çalışma saatine göre bonus
                "Raise Salary: " + raiseSalary() + "\n" + // Maaş artışı
                "Total Salary: " + (salary + bonus() - tax() + raiseSalary()) + "\n"; // Toplam maaş
    }

    public static void main(String[] args) {
        Emoloyee employee = new Emoloyee("ali",2000,45,2019);
        System.out.println(employee.toString());
    }




}
