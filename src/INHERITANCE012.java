import java.util.*;

class Employee{
    protected String name;
    protected double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getInfo(){
        return "Họ tên: " + name;
    }

    public double calculateSalary(){
        return salary;
    }
}
class FullTimeEmployee extends Employee{

    private double bonus;

    public FullTimeEmployee(String name, double salary, double bonus){
        super(name,salary);
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary(){
        return salary + bonus;
    }
    @Override
    public String getInfo(){
        return  "Loại: FullTime\n"
        + "Họ tên: " + name + "\n"
        + "Lương cơ bản: " + String.format("%.1f",salary) + "\n"
        + "Thưởng: " + String.format("%.1f",bonus) + "\n"
        + "=> Lương thực nhận: " + String.format("%.1f",calculateSalary()); 
    }
}
class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, double salary, int hoursWorked, double hourlyRate){
        super(name, salary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double calculateSalary(){
        return hoursWorked*hourlyRate;
    }
    @Override
    public String getInfo(){
        return  "Loại: PartTime\n"
        + "Họ tên: " + name + "\n"
        + "Số giờ làm việc: " +  hoursWorked + "giờ\n"
        + "Tiền công mỗi giờ: " + String.format("%.1f",hourlyRate) + "\n"
        + "=> Lương thực nhận: " + String.format("%.1f", calculateSalary());
    }
}
public class INHERITANCE012 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Thông tin nhân viên ---");

        String type1 = sc.nextLine();
        String name1 = sc.nextLine();
        
    }
}
