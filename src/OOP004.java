import java.util.Scanner;

class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }

    public void move(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    public double distanceTo(Point p){
        int dx = x - p.getX();
        int dy = y - p.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }
}
public class OOP004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {

            int xA = sc.nextInt();
            int yA = sc.nextInt();
            int xB = sc.nextInt();
            int yB = sc.nextInt();

            Point A = new Point(xA, yA);
            Point B = new Point(xB, yB);

            A.move(1, 1);

            double res = A.distanceTo(B);
            System.out.printf("%.2f\n",res);
        }
        sc.close();
    }
}
