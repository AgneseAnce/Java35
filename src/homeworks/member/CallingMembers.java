package homeworks.member;

public class CallingMembers {
    public static void main(String[] args) {
        Employee employee = new Employee("Bob", 45, "+23423423", "Street", 1000, "Worker");
        Manager manager = new Manager("Nick", 45, "+231231231", "Street", 2000, "Sales");

        employee.printSalary();
        manager.printSalary();

    }
}
