import java.util.*;

class Item{
    public String name;
    public int weight;
    public Item(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    public Item(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }
    public int getWeight(){
        return this.weight;
    }
}

abstract class Box{
    abstract void add(Item item);
    abstract boolean isInBox(Item item);
}

class BoxWithMaxWeight extends Box{
    ArrayList<Item> items = new ArrayList<>();
    private final int maxWeight;
    public BoxWithMaxWeight(int maxWeight){
        this.maxWeight = maxWeight;
    }
    @Override
    public void add(Item item){
        int total = 0;
        for(Item i:items){
            total += i.getWeight();
        }
        if(item.getWeight() + total <= maxWeight) items.add(item);
    }
    @Override
    public boolean isInBox(Item item){
        for (Item i : items) {
            if (i.getName().equals(item.getName())) {
                return true;
            }
        }
        return false;
    }
}

public class INHERITANCE002{
    public static void main(String[] args){
        BoxWithMaxWeight b = new BoxWithMaxWeight(10);
        b.add(new Item ("Saludo", 5));
        b.add(new Item("Pirkka", 5));
        b.add(new Item("Kopi Luwak", 5));
        System.out.println(b.isInBox(new Item("Saludo")));
        System.out.println(b.isInBox(new Item("Pirkka")));
        System.out.println(b.isInBox(new Item("Kopi Luwak")));
    }
}