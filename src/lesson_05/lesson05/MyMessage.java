package lesson_05.lesson05;

public class MyMessage implements Runnable {
    String message;
    public MyMessage(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(message);
    }
}
