
public class Colas {
    private Nodo inicioCola, finalCola;
    String Cola = "";
    
    public Colas(){
        inicioCola = null;
        finalCola = null;
    }
    
    public boolean ColaVacia(){
        if (inicioCola ==null) {
            return true;
        } else {
            return false;
        }
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
    }
    
    public int Extraer(){
        if(!ColaVacia()){
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
