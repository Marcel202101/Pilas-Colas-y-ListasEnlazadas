
import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion=0;
        String nom;
        int num ;
        Arbol a = new Arbol();
        do{
            System.out.println("\nMenu: ");
            System.out.println("1.- Agregar");
            System.out.println("2.- Recorrido INORDEN");
            System.out.println("3.- Recorrido PREORDEN");
            System.out.println("4.- Recorrido POSTORDEN");
            System.out.println("5.- Padre comun entre (A,B)");
            System.out.println("6.- Salir");
            System.out.print("opcion: ");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    //System.out.println("Ingrese Nombre: ");
                    //nom = input.next();
                    System.out.println("Ingrese Dato: ");
                    num = input.nextInt();
                    a.agregar(num);
                    break;
                case 2:
                    if(a.Vacio()==false){
                        a.inOrden(a.raiz);
                    }else{
                        System.out.println("Esta vacio");
                    }
                    break;
                case 3:
                    if(a.Vacio()==false){
                        a.preOrden(a.raiz);
                    }else{
                        System.out.println("Esta vacio");
                    }
                    break;
                case 4:
                    if(a.Vacio()==false){
                        a.postOrden(a.raiz);
                    }else{
                        System.out.println("Esta vacio");
                    }
                    break;
                    
                case 5:
                    if(a.Vacio()== false){
                        int num1,num2;
                        System.out.println("Ingrese A: ");
                        num1 = input.nextInt();
                        
                        if(a.buscarNodo(num1)){
                            System.out.println("Ingrese B: ");
                            num2 = input.nextInt();
                            if(a.buscarNodo(num2)){
                                System.out.println("El Padre Comun es: "+ (a.Padre(a.raiz, num1, num2)).dato);
                                
                            }else{
                                System.out.println("No encontrado");
                                break;
                            }
                        }else{
                            System.out.println("No encontrado");
                            break;
                            
                        }
                    }
                    break;
            }
        }while (opcion!=6);
    }
    
}
