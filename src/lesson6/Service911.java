package lesson6;

public class Service911 implements Observer {
    @Override
    public void update(Detector subject ) {
        if (subject instanceof SmokeDetector) {

            System.out.printf("По адресу %s сработал %s\n ", ((SmokeDetector) subject).getUser().getAddress(), ((SmokeDetector)subject).getTool());
            //... отправить бригаду на адрес
        }


    }
}
