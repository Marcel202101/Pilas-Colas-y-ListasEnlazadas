public class Nodo {
    
    Object valor;
    Nodo siguiente;

    public Nodo(Object valor) {
        this.valor = valor;
        this.siguiente = null;
    }
    
    public Object obtenerV(){
        return valor;
    }
    
    public void enlazar(Nodo n){
        siguiente = n;
    }
    
    public Nodo obtenerSiguiente(){
        return siguiente;
    }
}
