import java.util.*;

class Teacher{
    protected String name;
    protected double baseSalary;

    public Teacher(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public String getTeacher(){
        return name;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public double calculateSalary(){
        return baseSalary;
    }
    public String getInfo(){
        return name;
    }
}
class PermanentLecturer extends Teacher{
    private double researchAllowance;

    public PermanentLecturer(String name, double baseSalary, double researchAllowance){
        super(name,baseSalary);
        this.researchAllowance = researchAllowance;
    }
    @Override
    public double calculateSalary(){
        return baseSalary + researchAllowance;
    }
    @Override
    public String getInfo(){
        return "Loại giảng viên: Permanent\n"
        + "Họ tên: " + name + "\n"
        + "Lương thực nhận: " + String.format("%.1f",calculateSalary());
    }
}
class VisitingLecturer extends Teacher{
    private int teachingHours;
    private double paymentPerHour;

    public VisitingLecturer(String name, int teachingHours, double paymentPerHour){
        super(name,0);
        this.teachingHours = teachingHours;
        this.paymentPerHour = paymentPerHour;
    }
    
    @Override
    public double calculateSalary(){
        return teachingHours*paymentPerHour;
    }
    @Override
    public String getInfo(){
        return "Loại giảng viên: Visiting\n"
        + "Họ tên: " + name + "\n"
        +"Lương thực nhận: " + String.format("%.1f",calculateSalary());
    }
}
public class INHERITANCE013 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Thông tin giảng viên ---");

        String type1 = sc.nextLine();
        String name1 = sc.nextLine();

        if(type1.equals("PermanentLecturer")){
            double baseSalary = Double.parseDouble(sc.nextLine());
            double researchAllowance = Double.parseDouble(sc.nextLine());
            PermanentLecturer permanentLecturer = new PermanentLecturer(name1,baseSalary,researchAllowance);
            System.out.println(permanentLecturer.getInfo());
        }
        else if (type1.equals("VisitingLecturer")){
            int teachingHours = Integer.parseInt(sc.nextLine());
            double paymentPerHour = Double.parseDouble(sc.nextLine());
            VisitingLecturer visitingLecturer = new VisitingLecturer(name1, teachingHours,paymentPerHour);
            System.out.println(visitingLecturer.getInfo());
        }

         String type2 = sc.nextLine();
        String name2 = sc.nextLine();

        if(type2.equals("PermanentLecturer")){
            double baseSalary = Double.parseDouble(sc.nextLine());
            double researchAllowance = Double.parseDouble(sc.nextLine());
            PermanentLecturer permanentLecturer = new PermanentLecturer(name2,baseSalary,researchAllowance);
            System.out.println(permanentLecturer.getInfo());
        }
        else if (type2.equals("VisitingLecturer")){
            int teachingHours = Integer.parseInt(sc.nextLine());
            double paymentPerHour = Double.parseDouble(sc.nextLine());
            VisitingLecturer visitingLecturer = new VisitingLecturer(name2, teachingHours,paymentPerHour);
            System.out.println(visitingLecturer.getInfo());
        }
        sc.close();        
    }   
}
