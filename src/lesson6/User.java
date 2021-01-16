package lesson6;

public class User implements Observer {
    private String address;

    public User() {
    }

    public String getAddress() {
        return address;
    }

    public User(String address) {
        this.address = address;
    }

    @Override
    public void update(Detector subject) {
        if (subject instanceof MotionDetector) {
            System.out.printf("Сработал датчик   : %s\n ", ((MotionDetector) subject).getTool());

        } else {
            System.out.printf("Сработал датчик   : %s\n ", subject.getClass().getSimpleName());
        }
    }
}
