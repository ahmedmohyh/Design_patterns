public class Singleton { // Creational Design pattern
    public static void main (String []args ){
        Servicesing S1 = Servicesing.getinstance();

        Servicesing S2 = Servicesing.getinstance();
        System.out.println(S1.hashCode());
        S1.print();
        System.out.println();
        System.out.println(S2.hashCode());
        S2.print();

    }
}
