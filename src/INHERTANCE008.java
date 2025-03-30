
class Person{
    private String name;
    private String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString(){
        return name + " - " + address;
    }
}
class Student extends Person{
    private int credits;

    Student(String name, String address){
        super(name,address);
        this.credits = 0;
    }

    public int study(){
        return credits ++;
    }
    public int credits(){
        return credits;
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
public class INHERTANCE008 {
    public static void main(String[] args) {
        Student student  = new Student("Ollie","6381 Hollywood Blvd. Los Angeles 90028");

       System.out.println(student.toString());
        System.out.println("Study credits " + student.credits());

        student.study();
        System.out.println("Study credits " + student.credits());
    }
}

//Tín chỉ