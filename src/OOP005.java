import java.util.Objects;

class MyStuff {
    private String name;

    MyStuff(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MyStuff myStuff = (MyStuff) obj;
        return Objects.equals(name, myStuff.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

public class OOP005 {
    public static void main(String[] args) {
        MyStuff m1 = new MyStuff("PC");
        MyStuff m2 = new MyStuff("PC");

        if (m1.equals(m2)) {
            System.out.println("value compared: same");
        } else {
            System.out.println("value compared: different");
        }

        if (m1 == m2) {
            System.out.println("reference compared: same");
        } else {
            System.out.println("reference compared: different");
        }
    }
}
//Class MyStuff