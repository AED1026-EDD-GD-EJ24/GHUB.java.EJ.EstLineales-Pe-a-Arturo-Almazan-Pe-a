package miPrincipal;
//Atributo cabeza apunta al tope de la pila
public class Pila<T>{
    private Nodo<T> cabeza;
    //Almacena el total de elementos de la pila
    private int tamanio;
    //constructor de defecto
    public Pila(){
        cabeza = null;
        tamanio = 0;
    }
    //Devuelve el total de elementos de la pila
    public int getTamanio(){
        return tamanio;
    }
    //Verifica si la pila esta vacia
    Public  esVacia(){
        return (cabeza == null);
    }
    public void apilar (T valor){
    //Crear un nuevo modo
    Nodo<T> nuevo = new Nodo<T>();
        nuevo.setValor(valor);
        if(esVacia()){
            //cabeza apunta el nuevo modo
            cabeza =nuevo;
        
        }else{
            //se enlaza el campo siguiente de nuevo con la cabeza
            nuevo.setSiguiente(cabeza);
            //la nueva cabeza de la pila pasa a ser nuevo 
            cabeza = nuevo;
        }
        //Incrementar el tamaño porque hay un nuevo elemento en lapila
        tamanio++;
    
    }
    //Eliminar un elemento de la pila
    public void retirar(){
        if(!esVacia()){
            cabeza = cabeza.getSiguiente();
            tamanio --;
        }
        
    }
    //Devuelve el elemento almacenado en el tope de la cima
    public T cima(){
        if ( esVacia()){
            return cabeza get.valor();
        }else{
            return null;
        }

        
    
    }
    }
