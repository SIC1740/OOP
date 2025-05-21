import java.util.*;

class Pair<T>{
    private T first;
    private T second;

    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    }
    public T getFirst(){
        return first;
    }
    public T getSecond(){
        return second;
    }
    public void setFirst(){
        this.first = first;
    }
    public void setSecond(){
        this.second = second;
    }

    public void swap(){
        T temp = first;
        first = second;
        second = temp;
    }
    public void print(){
        if(first instanceof String && second instanceof String){
            System.out.println("'" + first + "' '" + second + "'");
        }
        else {
            System.out.println(first + " " + second);
        }
    }
}
public class GENERIC001 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while(t --> 0){
            String line = sc.nextLine();
            String[] part = line.split(" ");

            if(isInteger(part[0])){
                int a = Integer.parseInt(part[0]);
                int b = Integer.parseInt(part[1]);

                Pair<Integer> pair = new Pair<>(a,b);
                pair.swap();
                pair.print();
            }
            else {
                Pair<String> pair = new Pair<>(part[0],part[1]);

                pair.swap();
                pair.print();
            }
        }
        sc.close();

    }
    public static boolean isInteger(String s){
        try{
            Integer.parseInt(s);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
}
