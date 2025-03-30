import java.util.PriorityQueue;
import java.util.*;

class Student1 implements Comparable<Student1> {
    private int id;
    private String name;
    double cgpa;

    public Student1(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student1 other) {
        if(Double.compare(this.cgpa, other.cgpa) != 0){
            return Double.compare(other.cgpa, this.cgpa);
        }
        else if(!this.name.equals(other.name)){
            return this.name.compareTo(other.name);
        }
        else {
            return Integer.compare(this.id, other.id);
        }
    }
}
class Priorities{
    private PriorityQueue<Student1> queue = new PriorityQueue<>();

    public List<Student1> getStudents(List<String> events){
        for(String event : events){
            if(event.startsWith("ENTER")){
                String[] parts = event.split(" ");

                String name = parts[1];
                Double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);

                Student1 student1 = new Student1(id, name, cgpa);
                queue.add(student1);
            }
            else if (event.startsWith("SERVED")){
                queue.poll();
            }
        }
        List<Student1> students = new ArrayList<>();
        while(!queue.isEmpty()){
            students.add(queue.poll());
        }
        return students;
    }
}
public class DATA_STRUCTURE001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<String> students = new ArrayList<>();
        for(int i = 0; i < t; i++){
            students.add(sc.nextLine());
        }

        Priorities priorities = new Priorities();
        List<Student1> events = priorities.getStudents(students);

        if(events.isEmpty()){
            System.out.println("EMPTY");
        }
        else{
            for(Student1 student : events){
                System.out.println(student.getName());
            }
        }
        sc.close();
    }
}
