package lesson6;

public class Client {
    public static void main(String[] args) {
        Service911 service911 = new Service911();
        User user = new User("9 street 8");
        Detector detector1 = new SmokeDetector(user, "датчик дыма");
        detector1.attach(service911);

        Detector detector2 = new MotionDetector("датчик движения 1");
        detector2.attach(new User());
       // detector2.attach(servicePolice);

        Detector detector3 = new MotionDetector("датчик движения 3");
        detector3.attach(user);

        detector1.alarm();
        detector2.alarm();
        detector3.alarm();



    }
}