
import java.util.ArrayList;
import java.util.List;

public class Lista {
    Nodo cabeza,fin;
    int tam ;
    
    public Lista(){
        cabeza = null;
        tam = 0;
    }
    
    public boolean vacia(){
        return (cabeza==null)?true:false;
    }
    
    public void agregar(Object obj){
        if(cabeza == null){
            cabeza = new Nodo(obj);
            fin = cabeza;
        }else{
           Nodo temp = cabeza;
           Nodo nuevo = new Nodo(obj);
           nuevo.enlazar(temp);
           cabeza = nuevo;
        }
        tam++;
    }
    
    public void agregarFinal(Object obj){
        if(cabeza == null){
            cabeza = new Nodo(obj);
        }else{
            fin.siguiente = new Nodo(obj);
            fin = fin.siguiente;
        }
        tam++;
    }
    
    public int tamano(){
        return tam;
    }
    
    public Object buscar(int o){
        int cont = 1;
        Nodo temp = cabeza;
        if(cont == o){
            return temp.valor;
        }else{
            while(cont<o){
                temp = temp.obtenerSiguiente();
                cont++;
            }
            return temp.valor;
        }
    }
    
     public List BuscarItem(int item){
        List lista = new ArrayList();
        int cont = 1;
        Nodo recorrido = cabeza;
        while(cont<tam+1){
            if(item == (int)recorrido.valor){
                lista.add(cont);
            }
            recorrido = recorrido.siguiente;
            cont++;
        }
        return lista;
    }
    
    public void eliminar(){
        cabeza = cabeza.obtenerSiguiente();
        tam--;
    }
    public void eliminarByIndex(int pos){
        int cont = 0;
        Nodo temp = cabeza;
        if(pos == 0 ){
            cabeza = cabeza.obtenerSiguiente();
        }else{
        while(cont<pos-1){
            temp = temp.obtenerSiguiente();
            cont++;
            }
            temp.enlazar(temp.obtenerSiguiente().obtenerSiguiente());
        }
        tam--;
    }
    public void mostrar(){
        Nodo aux = cabeza;
        while(aux!=null){
            System.out.print(" "+ aux.obtenerV() + " ");
            aux = aux.obtenerSiguiente();
        }
    }
}
