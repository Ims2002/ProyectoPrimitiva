package proyectoPrimitiva;

import java.util.Random;
import java.util.Scanner;


public class Menu {

    static Scanner lector = new Scanner(System.in);

    public static int random(int min, int max) {//para los 2 bombos
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }


    public static void menu() {
        System.out.println(
                "*************************"+"\n"+
                "* Bienvenido     al     *"+"\n"+
                "* JUEGO DE LA PRIMITIVA *"+"\n"+
                "*************************"
        );
    }

    public static void menuInical() {
        int opcion;
        boolean validacion = false;

        do {
            System.out.println(
                    "6 numeros con los que desea jugar"+"\n"+
                    "1. Teclado Manual"+"\n"+
                    "2. Combinacíon Aleatorio"+"\n"
                    +"\n"
                    +"\n"+
                    "/ Recordar al usuario que el Reitegro sera Aleatorio"
            );

            opcion = Integer.parseInt(lector.nextLine());
            validacion = opcion >= 1 && opcion <= 2;
        }while (!validacion);

    }

    public  static int menuModalidad() {
        int opcion;
        boolean validacion = false;
        do {
            System.out.println(
                    "MODALIDAD DE JUEGO" +"\n"
                    +"\n"+
                    "1. Juego único"+"\n"+
                    "2. Jugar hasta obtener premio"+"\n"+
                    "3. Jugar hasta obtener premio (sin reintegro)"+"\n"+
                    "4. Ciclo de 10000 sorteos"+"\n"+
                    "5. Jugar hasta obtener premio categoría especial"
            );
            opcion = Integer.parseInt(lector.nextLine());
            validacion = opcion >= 1 && opcion <= 5;
        }while (!validacion);

        return opcion;

    }

}
