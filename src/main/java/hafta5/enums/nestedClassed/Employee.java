package hafta5.enums.nestedClassed;
class Employee {
    private String name;
    private String surName;

    // Constructor
    public Employee(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    // İç sınıf - ContactInfo
    class ContactInfo {
        private String phoneNumber;
        private String mail;

        // Constructor
        public ContactInfo(String phoneNumber, String mail) {
            this.phoneNumber = phoneNumber;
            this.mail = mail;
        }

        public void displayContactInfo() {
            System.out.println("Telefon: " + phoneNumber);
            System.out.println("E-posta: " + mail);
        }
    }

    // Çalışan bilgilerini ekrana yazdıran metot
    public void displayEmployeeInfo(ContactInfo contactInfo) {
        System.out.println("Çalışan: " + name + " " + surName);
        contactInfo.displayContactInfo();
    }

    public static void main(String[] args) {
        // Dış sınıf nesnesi oluştur
        Employee employee = new Employee("Ali", "Yılmaz");

        // İç sınıf nesnesi oluştur
        Employee.ContactInfo contact = employee.new ContactInfo("123456789", "ali@example.com");

        // Çalışan ve iletişim bilgilerini ekrana yazdır
        employee.displayEmployeeInfo(contact);
    }
}

