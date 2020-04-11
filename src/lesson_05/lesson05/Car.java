package lesson_05.lesson05;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicBoolean;

public class Car implements Runnable {
    private static int CARS_COUNT;
    static {
        CARS_COUNT = 0;
    }
    private Race race;
    private int speed;
    private String name;
    private static CyclicBarrier cb ;
    private final static AtomicBoolean isWinner = new AtomicBoolean(false);

    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
        cb = new CyclicBarrier(MainClass.CARS_COUNT, new MyMessage("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!"));
    }
    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " готов");
            cb.await();

        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        MainClass.cdl.countDown();
        if (isWinner.compareAndSet(false, true)) {
            System.out.println(name + " you WIN!!!");
        }
    }
}
