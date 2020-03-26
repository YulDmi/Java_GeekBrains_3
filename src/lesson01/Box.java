package lesson01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruits> {

    private List<T> box;

    public Box() {
        this.box = new ArrayList<>();
    }

    public void putFruits(T... t) {
        if (t != null) {
            box.addAll(Arrays.asList(t));
        }
    }

    public Float getWeight() {
        Float totalWeight = 0f;

        for (T t : box) {
            if (t != null) {
                totalWeight += t.getWeight();
            }
        }
        return totalWeight;
    }

    public boolean compare(Box<?> box2) {
        return this.getWeight().equals(box2.getWeight());
    }

    public Box<T> pourAnotherBox() {
        Box<T> anotherBox = new Box<>();
        anotherBox.box.addAll(this.box);
        this.box.clear();
        return anotherBox;
    }
}

