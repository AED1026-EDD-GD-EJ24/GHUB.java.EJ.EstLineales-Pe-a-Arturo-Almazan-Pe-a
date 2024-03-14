package miPrincipal;

public class Delimitadores {
    public boolean evaluacion(String cadena){
        pila<String> pcaracteres = new Pila<String>();
        int i=0;
        boolean masElementosPorLeer = true;
        while (i<cadena.lenght() && masElementosPorLeer){
            char car = cadena.charAt(i);
            String s = charToString (car);
            i++;
            swtitch(car) {
                //en caso de apilar se da cuando
                //el caracter sea un operador de apertura
                //( [ { /* 

                
            }

        }
    }
    //Termina metodo
    private static String charToString(char ch){
        return String.valueOf(ch);

    }
}