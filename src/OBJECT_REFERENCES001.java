
class SimpleDate{
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof SimpleDate){
            SimpleDate d = (SimpleDate)o;
            return this.day == d.day && this.month == d.month && this.year == d.year;
        }
        return false;
    }
}
public class OBJECT_REFERENCES001 {
    public static void main(String[] args) {
        SimpleDate d1 = new SimpleDate(1,2,2000);
        SimpleDate d2 = new SimpleDate(5,2,2012);
        SimpleDate d3 = new SimpleDate(1,2,2000);

        System.out.println(d1.equals("heh"));
        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(d3));
    }
}
//Làm việc với lớp SimpleDate và phương thức equals trong Java