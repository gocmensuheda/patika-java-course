package hafta5.enums.record;

public record Student(String name, String surname, int number) {

    public static void main(String[] args) {
        Student student1=new Student("Ayşe", "Demir",765);
        System.out.println("Adı: " + student1.name + " soyadı: " + student1.surname + " numarası: " + student1.number);
        Student student2=new Student("Fatma", "Kaya",954);
        System.out.println("Adı: " + student2.name + " soyadı: " + student2.surname + " numarası: " + student2.number);


        System.out.println("\nstudent1 ve student2 eşit mi? " + student1.equals(student2));
        System.out.println("student1 hashCode: " + student1.hashCode());
        System.out.println("student2 hashCode: " + student2.hashCode());
    }

}
