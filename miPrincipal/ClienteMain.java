package miPrincipal;

public class ClienteMain{
    public static void main(String[] arg){
        //crear una nueva pila de enteros
        Pila<Integer> pila = new Pila<Integer> ();
        //apilar algunos datos enteros
        pila.apilar(2);
        pila.apilar(5);
        pila.apilar(7);
        System.out.println("el tope dela pila es "+ pila.cima());
        //se desapila
        pila.retirar();
        System.out.println("el tope dela pila es "+ pila.cima());
        }
}