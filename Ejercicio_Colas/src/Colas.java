
import java.util.ArrayList;
import java.util.List;


public class Colas {
    private Nodo inicioCola, finalCola;
    String Cola = "";
    int tam = 0;
    public Colas(){
        inicioCola = null;
        finalCola = null;
    }
    
    public void Vaciar(){
        inicioCola = null;
        finalCola = null;
        tam = 0;
        String Cola = "";
    }
    public boolean ColaVacia(){
        if (inicioCola ==null) {
            return true;
        } else {
            return false;
        }
    }
    public int Buscar( int pos){
        Nodo recorrido = inicioCola;
        int cont = 1;
        if(pos == cont){
            return recorrido.informacion;
        }else{
            while(cont < pos){
                recorrido = recorrido.siguiente;
                cont++;
            }
            return recorrido.informacion;
        }    
    }
    public List BuscarItem(int item){
        List lista = new ArrayList();
        int cont = 1;
        Nodo recorrido = inicioCola;
        while(cont<tam+1){
            if(item == recorrido.informacion){
                lista.add(cont);
            }
            recorrido = recorrido.siguiente;
            cont++;
        }
        return lista;
    }
    public void Insertar(int informacion){
        Nodo nuevo = new Nodo();
        nuevo.informacion = informacion;
        nuevo.siguiente = null;
        
        if(ColaVacia()){
            inicioCola = nuevo;
            finalCola = nuevo;
        }else{
            finalCola.siguiente = nuevo;
            finalCola = nuevo;
        }
        tam++;
    }
    public int Tamano(){
        return tam;
    }
    public int Extraer(){
        if(!ColaVacia()){
            tam--;
            int informacion = inicioCola.informacion;
            if (inicioCola == finalCola) {
                inicioCola = null;
                finalCola = null;
            } else {
                inicioCola = inicioCola.siguiente;
            }
            return informacion;
        }else{
            return 0;
        }
    }
    
    public void Mostrar(){
        Nodo recorrido = inicioCola;
        String ColaInvertida = "";
         
        while(recorrido != null){
            Cola += recorrido.informacion + " ";
            recorrido = recorrido.siguiente;
        
        }
        
        String cadena [] = Cola.split(" ");
        
        for (int i = cadena.length -1 ; i >=0; i--) {
            ColaInvertida += " " + cadena[i];
            
        }
        System.out.println(ColaInvertida);
        Cola = "";
        
    }
}
