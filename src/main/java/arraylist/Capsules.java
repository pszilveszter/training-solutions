package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private List<String> product = new ArrayList<>();

    public static void main(String[] args) {
        Capsules pipe = new Capsules();

        pipe.addLast("red");
        pipe.addFirst("white");
        pipe.addFirst("green");
        System.out.println(pipe.getColors());

        pipe.removeLast();
        pipe.addLast("green");
        pipe.removeFirst();
        pipe.addFirst("red");
        System.out.println(pipe.getColors());

    }


    public void addLast(String color) {
        product.add(color);
    }

    public void addFirst(String color) {
        product.add(0, color);
    }

    public void removeFirst() {
        product.remove(0);
    }

    public void removeLast() {
        product.remove(product.size() - 1);
    }

    public List<String> getColors() {
        return product;
    }


}
