import java.util.*;

public class GENERIC002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        while(t --> 0){
            String line = sc.nextLine();

            String[] part = line.trim().split("\\|");
            String target = part[1].trim();
            String[] arr = part[0].trim().split(" ");

            System.out.println(findFirstWidth(arr,target));
        }
        sc.close();

    }
    public static <T> int findFirstWidth(T[] array, T target ){
        for(int i = 0; i < array.length; ++i){
            if(array[i].equals(target)){
                return i;
            }
        }
        return -1;
    }
}
