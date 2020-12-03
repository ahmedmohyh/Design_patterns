import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Servicesing {
    private String [] s = {"a","b","c","d","e"};
    List<String > data = Arrays.asList(s);
    private static Servicesing myservice = new Servicesing();
    public Servicesing(){
        Collections.shuffle(data);
    }
    public void print (){
        for (String item : data ){
            System.out.printf("%s ",item);
        }
    }
    public static Servicesing getinstance(){
        return  myservice;
    }


}
