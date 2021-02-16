/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcel
 */
public class Pila {
    
    private Nodo ultimo;
    int tamano = 0;
    String Lista = "";
   
    
    public Pila(){
        ultimo = null;
        tamano = 0;
    }
    
    public boolean PilaVacia(){
        return ultimo == null;
    }
    
    public void Insertar(int nodo){
        Nodo nuevo = new Nodo(nodo);
        nuevo.siguiente = ultimo;
        ultimo = nuevo;
        tamano++;
    }
    
    public int Eliminar(){
        int aux = ultimo.info;
        ultimo = ultimo.siguiente;
        tamano--;
        return aux;
    }
    
    public int UltimoIngresado(){
        return ultimo.info;
    }
    
    public int Tamano(){
        return tamano;
    }
    
    public void Vaciar(){
        while(!PilaVacia()){
            Eliminar();
        }
    }
    
    public void Mostrar(){
        Nodo recorrer = ultimo;
        
        while(recorrer != null){
            Lista += recorrer.info + "\n";
            recorrer = recorrer.siguiente;
        }
        System.out.println(Lista);
        Lista = "";
    }
    
}
