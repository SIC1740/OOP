import java.util.*;

interface Identifiable{
    String getId();
}
interface Payable{
    double calculateMonthlyPay();
}
class FullTime implements Identifiable,Payable{
    private String  name;
    private String id;
    private double monthlySalary;

    public FullTime(String name, String id, double monthlySalary){
        this.name = name;
        this.id = id;
        this.monthlySalary = monthlySalary;
    }
    public String getName(){
        return name;
    }
    @Override
    public String getId(){
        return id;
    }
    public double getMonthlySalary(){
        return monthlySalary;
    }
    @Override
    public double calculateMonthlyPay(){
        return monthlySalary;
    }
}
class PartTime implements Identifiable, Payable{
    private String name;
    private String id;
    private double hourlyRate;
    private int hoursWorked;
    public PartTime(String name, String id, double hourlyRate, int hourWorked){
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hourWorked;
    }
    public String getName(){
        return name;
    }
    @Override
    public String getId(){
        return id;
    }
    public double getHourlyRate(){
        return hourlyRate;
    }
    public int getHoursWorked(){
        return hoursWorked;
    }
    @Override
    public double calculateMonthlyPay(){
        return hourlyRate*hoursWorked;
    }
}
public class INTERFACE022 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        List<Payable> employees = new ArrayList<>();
        while(true){
            String line = sc.nextLine().trim();
            if(line.equals("Calculate")) break;

            int startName = line.indexOf('"') + 1;
            int endName = line.indexOf('"',startName);
            String name = line.substring(startName,endName);
            
            String[] part = line.substring(endName+1).trim().split(" ");

            if(line.startsWith("FullTime")){
                String id = part[0];
                double salary = Double.parseDouble(part[1]);
                employees.add(new FullTime(name,id,salary));
            }
            else if(line.startsWith("PartTime")){
                String id = part[0];
                double hourlyRate = Double.parseDouble(part[1]);
                int hoursWorked = Integer.parseInt(part[2]);
                employees.add(new PartTime(name,id,hourlyRate,hoursWorked));
            }
        }
        double total = 0.0;
        for(Payable e : employees){
                total += e.calculateMonthlyPay();
        }
        System.out.printf("Total Monthly Payroll: %.2f\n", total);
    }
}
