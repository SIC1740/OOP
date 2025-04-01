import java.util.*;

class Song{
    private String name;
    private String author;
    private int duration;

    public Song(String name, String author, int duration){
        this.name = name;
        this.author = author;
        this.duration = duration;
    }

    public boolean equals(Song other){
        if(other == null){
            return false;
        }
        return this.name.equals(other.name) && this.author.equals(other.author) && this.duration == other.duration;
    }
}

public class OBJECT_REFERENCES002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String name = sc.next();
            String author = sc.next();
            int duration = sc.nextInt();
            sc.nextLine();
            String name1 = sc.next();
            String author1 = sc.next();
            int duration1 = sc.nextInt();
            sc.nextLine();

            Song song1 = new Song(name, author, duration);
            Song song2 = new Song(name1, author1, duration1);

            System.out.println(song1.equals(song2));
        }
        sc.close();
    }
}
