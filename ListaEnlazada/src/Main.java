
import java.util.List;
import java.util.Scanner;

/*
Implementacion: Todos los datos ingresados seran creados a partir de un nodo
que conectara asi con los siguientes nodos que tendran o no informacion
sabremos si un nodo forma parte de la lista si es distinto de null

/**
 *
 * @author Marcel
 */
public class Main {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lista list = new Lista();
        
        System.out.println("");
        
        System.out.println("Menu:");
        System.out.println("1.- Agregar al inicio ");
        System.out.println("2.- Agregar al fianl");
        System.out.println("3.- Consultar si esta Vacio");
        System.out.println("4.- Extraer");
        System.out.println("5.- Extraer(pos)");
        System.out.println("6.- Buscar por (pos)");
        System.out.println("7.- Buscar por item");
        System.out.println("8.- Tamano");
        System.out.println("9.- Mostrar");
        System.out.println("10.- Salir");
        System.out.print("Ingrese la opcion: ");
        int opcion = input.nextInt();
        
        while(opcion != 10){
            switch(opcion){
                case 1:
                    System.out.println("Valor a ingresar: ");
                    list.agregar(input.nextInt());
                    break;
                case 2:
                    System.out.println("Valor a ingresar: ");
                    list.agregarFinal(input.nextInt());
                    break;
                case 3:
                    if (list.vacia()) {
                        System.out.println("Lista Vacia");
                    } else {
                        System.out.println("Lista No Vacia");
                    }
                    break;
                case 4:
                    list.eliminar();
                    break;
                case 5:
                    System.out.println("Ingrese Indice: ");
                    list.eliminarByIndex(input.nextInt());
                    break;
                case 6:
                    System.out.println("Ingrese Indice: ");
            
                    list.buscar(input.nextInt());
                case 7:
                    if(list.vacia()){
                        System.out.println("Vacio");
                    }else{
                        System.out.print("Ingrese item a Buscar:");
                        int item = input.nextInt();
                        List p = list.BuscarItem(item);
                        System.out.print("Posicion Encontrada/s: ");
                        for (int i = 0; i < p.size(); i++) {
                            System.out.print(p.get(i) + " ");                            
                        }
                    }
                    break;
                case 8:
                    System.out.println((list.tamano()));
                case 9:
                    list.mostrar();
            }
        System.out.println("\nMenu:");
        System.out.println("1.- Agregar al inicio");
        System.out.println("2.- Agregar al fianl");
        System.out.println("3.- Consultar si esta Vacio");
        System.out.println("4.- Extraer");
        System.out.println("5.- Extraer(pos)");
        System.out.println("6.- Buscar por (pos)");
        System.out.println("7.- Tamano");
        System.out.println("8.- Mostrar");
        System.out.println("9.- Salir");
        System.out.print("Ingrese la opcion: ");
        opcion = input.nextInt();
        }
    }
    
}
