import java.util.Scanner;

public class Worker {
    private String name;
    private int socialSecurityNumber;
    private float wage;
    private int workingHours;

    public Worker(String name, int socialSecurityNumber, float wage, int workingHours) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.wage = wage;
        this.workingHours = workingHours;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Social Security Number: " + socialSecurityNumber);
    }

    public void displaySalary() {
        float salary = wage * workingHours;
        System.out.println("Salary: $" + String.format("%.2f", salary));
    }

    public static void main(String[] args) {

        Worker worker1 = new Worker("Ali Başarır", 12345 , 17.50f, 48);


        worker1.displayInfo();
        worker1.displaySalary();


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter worker's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter worker's Social Security Number: ");
        int ssn = scanner.nextInt();

        System.out.print("Enter worker's wage: ");
        float wage = scanner.nextFloat();

        System.out.print("Enter worker's working hours: ");
        int hours = scanner.nextInt();

        Worker worker2 = new Worker(name, ssn, wage, hours);


        worker2.displayInfo();
        worker2.displaySalary();


        scanner.close();
    }
}
