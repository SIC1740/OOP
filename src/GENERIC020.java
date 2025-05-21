import java.util.*;

interface Filter<T>{
    boolean test(T t);
}
class GenericFilter{
    public static <T> List <T> filter(List<T> input, Filter<T> filter){
        List<T> result = new ArrayList<>();
        for(T item : input){
            if(filter.test(item)){
                result.add(item);
            }
        }
        return result;
    }
}
//Lọc số nguyên chẵn
class IntegerEvenFilter implements Filter<Integer>{
    public boolean test(Integer t){
        return t % 2 ==0;
    }
}
//Lọc chuỗi theo độ dài
class StringLengthFilter implements Filter<String>{
    private int minLength;

    public StringLengthFilter(int minLength){
        this.minLength = minLength;
    }
    public boolean test(String s){
        return s.length() >= minLength;
    }
}
//Lớp nhân viên
class Employee{
    private String name;
    private double Salary;

    public Employee(String name, double Salary){
        this.name = name;
        this.Salary = Salary;
    }

    public String getName(){
        return name;
    }
    public double getSalary(){
        return Salary;
    }
    @Override
    public String toString(){
        return name + " " + Salary;
    }
}
class EmployeeSalaryFilter implements Filter<Employee>{
    private double minSalary;

    public EmployeeSalaryFilter(double minSalary){
        this.minSalary = minSalary;
    }
    public boolean test(Employee e){
        return e.getSalary()>= minSalary;
    }
}
public class GENERIC020 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            if(line.equals("End")) break;

            String part[] = line.split(" ");

            String command = part[0];

            switch(command){
                case "FilterIntEven": {
                    int n = Integer.parseInt(part[1]);
                    List<Integer> list = new ArrayList<>();
                    for(int i = 2; i < 2 + n; ++i){
                        list.add(Integer.parseInt(part[i]));
                    }
                    List<Integer> result = GenericFilter.filter(list,new IntegerEvenFilter());
                    print(result);
                    break;
                }
                case "FilterStringLength":{
                    int minLen = Integer.parseInt(part[1]);
                    int n = Integer.parseInt(part[2]);
                    List<String> list = new ArrayList<>();
                    for(int i = 3; i < 3 + n; ++i){
                        list.add(part[i]);
                    }
                    List<String> result = GenericFilter.filter(list,new StringLengthFilter(minLen));
                    print(result);
                    break;
                }
                case "FilterEmployeeSalary":{
                    double minSalary = Integer.parseInt(sc.nextLine());
                    int n = Integer.parseInt(sc.nextLine());
                    List<Employee> list = new ArrayList<>();
                    for(int i = 0; i < n; ++i){
                        String name = part[3 + i * 2];
                        double salary = Double.parseDouble(part[3+i*2+1]);
                        list.add(new Employee(name,salary));
                    }
                    List<Employee> result = GenericFilter.filter(list,new EmployeeSalaryFilter(minSalary));
                    print(result);
                    break;
                }
            }
        }
        sc.close();
    }

    private static<T> void print(List<T> list){
        if(list.isEmpty()){
            System.out.println("none");
        }
        else {
            for(T item: list){
                System.out.println(item);
            }
        }
    }
}
