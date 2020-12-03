package Observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements sub {
    private String name ;
    private String availablity ;
    List<Observer> obs = new ArrayList<Observer>();
    public Product (String S){
        name = S;
    }


    @Override
    public void add(Observer observe) {
        obs.add(observe);
    }

    @Override
    public void remove(Observer observer) {
        obs.remove(observer);
    }

    @Override
    public void notifyallobs() {
        for (Observer o : obs){
o.update(availablity);
        }
    }
    public void set_avail (boolean x){
availablity = name + (x ? " Available" : " Not Available");
notifyallobs();
    }
}
