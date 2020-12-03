import jdk.jfr.Frequency;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Servicesing {
    private String [] s = {"a","b","c","d","e"};
    List<String > data = Arrays.asList(s);
    private static Servicesing myservice ; // Eager
    public Servicesing(){
        Collections.shuffle(data);
    }
    public void print (){
        for (String item : data ){
            System.out.printf("%s ",item);
        }
    }
    public static Servicesing getinstance(){
       if (myservice == null ){
           synchronized (Servicesing.class){
               if (myservice  == null) {
                   myservice = new Servicesing();
               }
           }
       }
    return myservice;
    }



}
