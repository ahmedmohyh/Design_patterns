import java.util.Collections;

public class main {
    public static void main (String [] args){
Arth ad = new ComArth (new numArth(1),new numArth(2),'+');
Arth mul = new ComArth(new numArth(4),ad,'*');
System.out.println(mul.getval());
    }
}
abstract class Arth {
    public abstract int getval();
}
class numArth extends Arth{
private int  val;
public numArth (int x){
    val = x;
}
    @Override
    public int getval() {
        return val;
    }
}
class ComArth extends Arth {
    Arth first;
    Arth Second ;
    char sign ;
    ComArth(Arth a, Arth b, char c) {
    first = a ;
    Second = b;
    sign = c;
    }
    @Override
    public int getval() {
        switch (sign){
            case '+':
                return first.getval() + Second.getval();
            case '-':
                return first.getval() - Second.getval();
            case '*':
                return first.getval() * Second.getval();
            case '/':
                return first.getval() / Second.getval();
            default: throw new RuntimeException("Unknown sign");
        }

    }
}