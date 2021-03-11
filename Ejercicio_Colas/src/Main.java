import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion = 0, nodo_info = 0;
        Colas cola = new Colas();
        int pos;
        do{
            System.out.println("\nMenu:");
            System.out.println("1.- Insertar");
            System.out.println("2.- Extraer");
            System.out.println("3.- Extraer por Posicion");
            System.out.println("4.- Validar si es Vacio");
            System.out.println("5.- Vaciar ");
            System.out.println("6.- Cantidad de Elementos");
            System.out.println("7.- Buscar por Posicion");
            System.out.println("8.- Buscar por Item");
            System.out.println("9.- Mostrar");
            System.out.println("[ENTER].- Salir");
            System.out.println("\nOpcion: ");
            opcion = input.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el Valor a Insertar");
                    nodo_info = input.nextInt();
                    cola.Insertar(nodo_info);
                    break;
                case 2:
                    cola.Extraer();
                    break;
                case 3:
                    System.out.println("Posicion: ");
                    pos = input.nextInt();
                    int cont = 0;
                    while(!cola.ColaVacia() && cont< pos ){
                        cola.Extraer();
                        cont++;
                    }
                    break;
                case 4:
                    if(cola.ColaVacia()){
                        System.out.println("Cola Vacia");
                    }else{
                        System.out.println("Cola NO Vacia");
                    }
                    break;
                case 5:
                    if(cola.ColaVacia()){
                        System.out.println("Ya esta vacia");
                    }else{
                        cola.Vaciar();
                    }
                    break;
                case 6:
                    
                    if(cola.ColaVacia()){
                        System.out.println("Vacio");
                    }else{
                        System.out.println("Cantidad de Elementos: " +cola.Tamano());
                    }
                    break;
                case 7: 
                    if(cola.ColaVacia()){
                        System.out.println("Vacio");
                    }else{
                        System.out.print("Posicion: ");
                        pos = input.nextInt();
                        System.out.println("Valor: "+cola.Buscar(pos));
                        
                    }
                    break;
                case 8:
                    if(cola.ColaVacia()){
                        System.out.println("Vacio");
                    }else{
                        System.out.print("Ingrese item a Buscar:");
                        int item = input.nextInt();
                        List p = cola.BuscarItem(item);
                        System.out.print("Posicion Encontrada/s: ");
                        for (int i = 0; i < p.size(); i++) {
                            System.out.print(p.get(i) + " ");                            
                        }
                    }
                    break;
                case 9:
                    if(cola.ColaVacia()){
                        System.out.println("Vacio");
                    }else{
                        cola.Mostrar();
                    }
                    break;
                
            }   
        }while(opcion < 10);
    }
    
}
