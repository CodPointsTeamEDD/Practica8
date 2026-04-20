import Estructuras.*;
import java.util.Scanner;

public class Main {

    public void meter(PiCoLa<String> pc, String elemento){
        pc.meter(elemento);
    }
    public void sacar(PiCoLa<String> pc){
        pc.sacar();
    }
    public void mira(PiCoLa<String> pc){
        pc.estaVacia();
    }
    public void devolverTamanio(PiCoLa<String> pc){
        pc.devolverTamanio();
    }

    public static void ejecutarOperacion(Scanner sc, PiCoLa<String> pc, int operacion){
        switch (operacion) {
            case 1:
                System.out.println("");
                System.out.println("-----------------------------------");
                System.out.println("-  EJECUTANDO LA OPERACIÓN METER  -");
                System.out.println("-----------------------------------");
                System.out.println("");
                System.out.println("Por favor, ingresa la cadena a agregar a la estructura:");
                System.out.print(">");

                pc.meter(sc.nextLine());

                System.out.println("");
                System.out.println("-El estado actual de la estructura es el siguiente:");
                System.out.println(pc);

                break;  
            case 2:
                System.out.println("");
                pc.sacar();
                System.out.println("-Borrando elementos...");

                System.out.println("");
                System.out.println("-El estado actual de la estructura es el siguiente:");
                System.out.println(pc);
                break;
            case 3:
                System.out.println("");
                System.out.println("-Salida de la operación mira:");
                System.out.println("'" + pc.mira() + "'");
                System.out.println("");

                System.out.println("-El estado actual de la estructura es el siguiente:");
                System.out.println(pc);
                break;
            case 4:
                System.out.println("");
                System.out.println("-Salida de operacion esVacia: " + pc.estaVacia());
                System.out.println("");

                System.out.println("-El estado actual de la estructura es el siguiente:");
                System.out.println("");

                System.out.println(pc);
                break;
            case 5:
                System.out.println("");
                System.out.println("-Salida de operación devolverTamanio: " + pc.devolverTamanio());
                System.out.println("");
                
                System.out.println("-El estado actual de la estructura es el siguiente:");
                System.out.println(pc);
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Opcion ingresada invalida.");
        }




    }
    public static void main(String[] args) {
        String ROJO = "\u001B[31m";
        String RESET = "\u001B[0m";
        String VERDE = "\u001B[32m";

        Scanner sc = new Scanner(System.in);

        int estructuraSeleccionada;
        PiCoLa<String> pc = new Pila<String>();

        System.out.println("Bienvenido usuario");
        System.out.println("");

        int operacionSeleccionada;

        while (true) { 
            System.out.println("¿Que estructura de datos quieres usar?");
            System.out.println("(1) pila");
            System.out.println("(2) cola");
            System.out.print(">");

            if (sc.hasNextInt()) {
                estructuraSeleccionada = sc.nextInt();
                sc.nextLine();

                if (estructuraSeleccionada>2 || estructuraSeleccionada<0) {
                    System.out.println(ROJO + "Ingresa una opcion válida" + RESET);
                } else {
                    break;
                }
            } else {
                System.out.println(ROJO + "Debes ingresar un número" + RESET);
                sc.next();
            }
            System.out.println("");
        }

        

        if (estructuraSeleccionada == 1) {
            pc = new Pila<String>();
        } else {
            pc = new Cola<String>();
        }
        while (true){
            System.out.println("");
            System.out.println(VERDE + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::" + RESET);
            System.out.println("");
            System.out.println("¿Que operación deseas realizar?");
            System.out.println("(1) meter");
            System.out.println("(2) sacar");
            System.out.println("(3) mira");
            System.out.println("(4) es vacía");
            System.out.println("(5) devolver longitud");
            System.out.println("(6) salir");
            System.out.print(">");

            if (sc.hasNextInt()) {
                operacionSeleccionada = sc.nextInt();
                sc.nextLine();
                if (operacionSeleccionada > 6 || operacionSeleccionada < 0) {
                    System.out.println(ROJO + "Ingresa una opción válida" + RESET);
                } else {
                    ejecutarOperacion(sc, pc, operacionSeleccionada);
                }
            } else {
                System.out.println(ROJO + "Ingresa un número por favor" + RESET);
                sc.next();
            }
        }
    }
}
