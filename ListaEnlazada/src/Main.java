
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
        System.out.println("1.- Agregar al inicio "); //funciona
        System.out.println("2.- Agregar al fianl"); // funciona
        System.out.println("3.- Consultar si esta Vacio"); // funciona
        System.out.println("4.- Extraer"); //funciona
        System.out.println("5.- Extraer(pos)");//funciona
        System.out.println("6.- Buscar por (pos)");//no
        System.out.println("7.- Tamano");//funciona
        System.out.println("8.- Mostrar");//funciona
        System.out.println("9.- Salir");
        System.out.print("Ingrese la opcion");
        int opcion = input.nextInt();
        
        while(opcion != 9){
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
                    System.out.println((list.tamano()));
                case 8:
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
