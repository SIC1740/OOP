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

    public PartTimeEmployee(String name, int hoursWorked, double hourlyRate){
        super(name, 0);
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
        + "Số giờ làm việc: " +  hoursWorked + " giờ\n"
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

        if(type1.equals("FullTime")){
            double salary1 = Double.parseDouble(sc.nextLine());
            double bonus1 = Double.parseDouble(sc.nextLine());
            FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(name1, salary1,bonus1);
            System.out.println(fullTimeEmployee.getInfo());
        }
        else if(type1.equals("PartTime")){
            int hoursWorked1 = Integer.parseInt(sc.nextLine());
            double hourlyRate1 = Double.parseDouble(sc.nextLine());
            PartTimeEmployee partTimeEmployee = new PartTimeEmployee(name1,hoursWorked1, hourlyRate1);
            System.out.println(partTimeEmployee.getInfo());
        }
        System.out.println();
        String type2 = sc.nextLine();
        String name2 = sc.nextLine();

        if(type2.equals("FullTime")){
            double salary2 = Double.parseDouble(sc.nextLine());
            double bonus2 = Double.parseDouble(sc.nextLine());
            FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(name2, salary2,bonus2);
            System.out.println(fullTimeEmployee.getInfo());
        }
        else if(type2.equals("PartTime")){
            int hoursWorked2 = Integer.parseInt(sc.nextLine());
            double hourlyRate2 = Double.parseDouble(sc.nextLine());
            PartTimeEmployee partTimeEmployee = new PartTimeEmployee(name2,hoursWorked2, hourlyRate2);
            System.out.println(partTimeEmployee.getInfo());
        }
        sc.close();
    }
}
