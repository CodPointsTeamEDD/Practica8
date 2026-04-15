
public class Main {
    public static void main(String[] args) {
        Pila pila =  new Pila<>();

        pila.meter(2);
        pila.meter(5);
        pila.meter(78);
        pila.meter(6876);

        System.out.println(pila.toString());

        Cola cola =  new Cola<>();

        cola.meter(2);
        cola.meter(5);
        cola.meter(78);
        cola.meter(6876);

        System.out.println(cola.toString());
    }
}
