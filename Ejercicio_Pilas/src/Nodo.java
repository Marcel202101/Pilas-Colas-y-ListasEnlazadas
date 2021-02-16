
public class Nodo {
    int info;
    Nodo siguiente;
    
    public Nodo(int valor){
        info = valor;
        siguiente = null;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
