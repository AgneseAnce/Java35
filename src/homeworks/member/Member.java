package homeworks.member;

public abstract class Member {
    protected String name;
    protected int age;
    protected String phoneNumber;
    protected String address;
    protected int salary;

    public Member(String name, int age, String phoneNumber, String address, int salary){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
    public void printSalary(){
        System.out.printf("Salary of %s is %d \n", name, salary);
    }
}
