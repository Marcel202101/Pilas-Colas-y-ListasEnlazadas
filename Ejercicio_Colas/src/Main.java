import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion = 0, nodo_info = 0;
        Colas cola = new Colas();
        
        do{
            System.out.println("Menu:");
            System.out.println("1.- Insertar");
            System.out.println("2.- Extraer");
            System.out.println("3.- Mostrar");
            System.out.println("4.- Salir");
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
                    cola.Mostrar();
                    break;
                
            }   
        }while(opcion > 4);
    }
    
}
