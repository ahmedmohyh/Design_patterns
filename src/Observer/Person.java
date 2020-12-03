package Observer;

public class Person implements Observer {
    private String name;
    public Person (String S){
        name = S;
    }

    @Override
    public void update(String mess) {
        System.out.println("You got a new notification "+name +"  "+ mess);
    }

}
