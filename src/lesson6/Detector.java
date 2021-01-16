package lesson6;

import java.util.ArrayList;
import java.util.List;

public abstract class Detector {
    private List<Observer> observers = new ArrayList<>();



    public void attach(Observer observer) {
        observers.add(observer);
    }


    public void detach(Observer observer) {
        observers.remove(observer);
    }


    protected void alarm( ){
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

}
