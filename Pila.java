
package ingresotipopila;


public class Pila {
    private Nodo UltimoValorIngresado;
    int tamaño=0;
    
    public Pila(){
        UltimoValorIngresado=null;
        tamaño=0;
    }
    
    //Metodo para insertar un elemento a la pila
    public void InsertarNodo(int nodo){
        Nodo nuevo_nodo=new Nodo(nodo);
        nuevo_nodo.sgte_nodo=UltimoValorIngresado;
        UltimoValorIngresado=nuevo_nodo;
        tamaño++;
        
    }
    
    //Método para mostrar el contenido de la pila
    public void ImprimirNodo(){
        Nodo recorrido=UltimoValorIngresado;
        while(recorrido!=null){
            System.out.println(""+recorrido.valor);
            recorrido=recorrido.sgte_nodo;
        }
    }
}
