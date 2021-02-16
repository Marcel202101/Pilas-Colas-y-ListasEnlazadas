import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int opcion = 0;
    int nodo =0;
    Pila pila = new Pila();
    
    do{
        System.out.println("Menu:");
        System.out.println("1.- Insertar");
        System.out.println("2.- Eliminar");
        System.out.println("3.- Consultar si esta Vacio");
        System.out.println("4.- Ultimo Valor");
        System.out.println("5.- Cantidad de Nodos");
        System.out.println("6.- Vaciar");
        System.out.println("7.- Mostrar");
        System.out.println("8.- Salir\n");
        System.out.print("Ingrese la opcion");
        opcion = input.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Ingrese el Valor a Insertar");
                    nodo = input.nextInt();
                    pila.Insertar(nodo);
                    break;
                case 2:
                    if(!pila.PilaVacia()){
                        pila.Eliminar();
                    }else{
                        System.out.println("No hay Datos que Eliminar");
                    }
                    break;
                case 3:
                    if(pila.PilaVacia()){
                        System.out.println("Esta Vacia");
                    }else{
                        System.out.println("No esta Vacia");
                    }
                    
                    break;
                case 4:
                     if(pila.PilaVacia()){
                        System.out.println("No hay Datos");
                    }else{
                        pila.UltimoIngresado();
                    }
                    
                    break;
                case 5:
                    System.out.println("Hay: " + pila.Tamano());
                    break;
                case 6:
                    if(!pila.PilaVacia()){
                        pila.Vaciar();    
                    }else{
                        System.out.println("No hay Elementos que eliminar");
                    }
                    
                    break;
                case 7:
                    pila.Mostrar();
                    break;
                
                default:
                    System.out.println("Error");
                    break;
        }
    }while(opcion != 8);
   
}
