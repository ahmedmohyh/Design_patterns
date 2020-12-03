package Observer;

import java.util.TreeMap;

public class exc {
    public static void main(String[] args) {
        Product banana = new Product("Ban");
        Person Khalid = new Person("Khalid");
        Person Ahmed = new Person("Ahmed");
        Person Farah = new Person("Farah");
        banana.add(Khalid);
        banana.add(Ahmed);
        banana.add(Farah);
       for (int i = 0 ;i <5; i++){
           boolean ava = i % 2 == 0;
           banana.set_avail(ava);
           System.out.println("---------------------------------");
           if (i == 2 ) banana.remove(Ahmed);
           try {
Thread.sleep(5000);
           }catch (InterruptedException ie){}


       }
    }
}