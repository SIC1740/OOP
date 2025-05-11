import java.util.*;

 interface Identifiable{
    String getId();
}
class Human implements Identifiable{
    private String name;
    private int  age;
    private String id;

    public Human(String name, int age, String id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String getId(){
        return id;
    }
}
class Robot implements Identifiable{
    private String model;
    private String id;
    public Robot(String model, String id){
        this.model = model;
        this.id = id;
    }
    public String getModel(){
        return model;
    }
    @Override
    public String getId(){
        return id;
    }
}

public class INTERFACE020{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Identifiable> entities = new ArrayList<>();
        while (true){
            String line = sc.nextLine();
            if(line.equals("End")){
                break;
            }
            String [] tokens = line.split(" ");

            if(tokens[0].equals("Human")){
                String name = tokens[1];
                int age = Integer.parseInt(tokens[2]);
                String id = tokens[3];
                entities.add(new Human(name,age,id));
            }
            else if(tokens[0].equals("Robot")){
                String models = tokens[1];
                String id = tokens[2];
                entities.add(new Robot(models,id));
            }
        }
        String fakeIdSuffix = sc.nextLine();

        for(Identifiable entity : entities){
            if(entity.getId().endsWith(fakeIdSuffix)){
                System.out.println(entity.getId());
            }
        }
        sc.close();

    }
}