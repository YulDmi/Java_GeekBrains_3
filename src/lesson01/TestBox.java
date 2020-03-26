package lesson01;



public class TestBox {
    public static void main(String[] args) {
        //  ArrayList<Apple> apples = new ArrayList<>();
        Box<Apple> box1 = new Box<>();
        Box<Orange> box4 = new Box<>();
        Box<Orange> box2 = new Box<>();
        //    Apple[] apples = new Apple[3];
        //   box1.putFruits(apples);
        Orange orange = new Orange();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        box1.putFruits(apple1, apple2, apple3);
        box2.putFruits(orange, new Orange());
        box4.putFruits(new Orange());
        System.out.println(box2.getWeight());
        System.out.println(box2.compare(box1));
        Box<Orange> box3 = box2.pourAnotherBox();
        System.out.println(box3.getWeight());
        System.out.println(box2.getWeight());
        box2 = box4.pourAnotherBox();
        System.out.println(box2.getWeight());
        box2.putFruits(new Orange(), new Orange(1.2f));
        System.out.println(box2.getWeight());
    }
}
