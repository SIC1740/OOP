
interface TacoBox{
    int tacoRemaining();
    void eat();
}
class TripleTacobox implements TacoBox{
    private int tacos;

    public TripleTacobox() {
        this.tacos = 3;
    }

    @Override
    public int tacoRemaining() {
        return tacos;
    }

    @Override
    public void eat() {
        if(tacos > 0){
            tacos--;
        }
    }
}
class CustomTacoBox implements TacoBox{
    private int tacos;

    public CustomTacoBox(int initialTacos) {
        this.tacos = initialTacos;
    }

    @Override
    public int tacoRemaining() {
        return tacos;
    }

    @Override
    public void eat() {
        if(tacos > 0){
            tacos--;
        }
    }
}
public class INTERFACE003 {
    public static void main(String[] args) {
        TripleTacobox tripleTacobox = new TripleTacobox();

        tripleTacobox.eat();
        tripleTacobox.eat();

        System.out.println("Triple taco boxes left: "+ tripleTacobox.tacoRemaining());

        CustomTacoBox customTacoBox = new CustomTacoBox(8);
        customTacoBox.eat();

        System.out.println("Custom taco boxes left: "+ customTacoBox.tacoRemaining());

    }
}
