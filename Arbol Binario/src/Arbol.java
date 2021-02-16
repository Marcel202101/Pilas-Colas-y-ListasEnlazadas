public class Arbol {
    Nodo raiz;

    public Arbol() {
        raiz = null;
    }
    
    public boolean Vacio(){
        return raiz ==null;
    }
    
    public void agregar(int d){
        Nodo nuevo = new Nodo(d);
        if(raiz == null){
            raiz = nuevo;
        }else{
            Nodo aux = raiz;
            Nodo padre;
            while(true){
                padre = aux;
                if(d<aux.dato){
                    aux = aux.izq;
                    if(aux == null){
                        padre.izq = nuevo;
                        return;
                    }
                }else{
                    aux = aux.der;
                    if(aux==null){
                        padre.der = nuevo;
                        return;
                    }
                }
            }
        }
    }
    
    public void inOrden(Nodo r){
         if(r!=null){
            inOrden(r.izq);
            System.out.print(r.dato+ " ");
            inOrden(r.der); 
         }
    }
    
    public void preOrden(Nodo r){
        if(r!=null){
           System.out.print(r.dato+ " ");
           preOrden(r.izq);
           preOrden(r.der); 
        }
    }
    public void postOrden(Nodo r){
        if(r!=null){
           postOrden(r.izq);
           postOrden(r.der); 
           System.out.print(r.dato + " ");
        }
    }
    
    public boolean buscarNodo(int d){
        Nodo aux = raiz;
        while(aux.dato !=d){
            if(d<aux.dato ){
                aux= aux.izq;
            }else{
                aux = aux.der;
            }
            if(aux == null){
                return false;
            }
        }
        return true;
    }
    
    public Nodo Padre(Nodo r,int a, int b){
        Nodo izq=null,der=null;
        if(r==null) {
            return null; 
        }
        if(r.dato==a || r.dato==b) {
            return r; 
        } 
        izq = Padre(r.izq,a,b);
        der = Padre(r.der,a,b); 
        if(izq!=null && der!=null) {
            return r; 
        } 
        return (izq!=null)? izq: der; 
    }
    
    public boolean eliminar(int d){
        Nodo aux = raiz;
        Nodo padre = raiz; 
        boolean izq = true;
        while(aux.dato != d){
            padre = aux;
            if(d<aux.dato){
                izq = true;
                aux = aux.izq;
            }else{
                izq = false;
                aux = aux.der;
            }
            if(aux == null){
                return false;
            }
        }
        if(aux.izq == null && aux.der == null){
            if(aux == raiz){
                raiz = null;
            }else if(izq){
                padre.izq = null;
            }else{
                padre.der = null;
            }
        }else if(aux.der == null){
            if(aux == raiz){
                raiz = aux.izq;
            }else if(izq){
                padre.izq = aux.izq;
            }else{
                padre.der = aux.izq;
            }
        }else if(aux.izq == null){
            if(aux == raiz){
                raiz = aux.der;
            }else if(izq){
                padre.izq = aux.der;
            }else{
                padre.der = aux.izq;
            }
        }else{
            Nodo rr = obtenerNodoR(aux);
            if(aux == raiz){
                raiz = rr;
            }else if(izq){
                padre.izq = rr;
            }else{
                padre.der = rr;
            }
            rr.izq = aux.izq;
        }
        return true;
    }
       public Nodo obtenerNodoR(Nodo nodoR) {
        Nodo rempPadre = nodoR;
        Nodo rr = nodoR;
        Nodo aux = nodoR.der;
        while(aux!=null){
            rempPadre = rr;
            rr=aux;
            aux = aux.izq;
        }
        if(rr != nodoR.der){
            rempPadre.izq = rr.der;
            rr.der = nodoR.der;
        }
        System.out.println("Nodo remp: "+ rr);
        return rr;
    }
 
}