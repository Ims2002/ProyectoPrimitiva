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
            System.out.println(
                    "6 numeros con los que desea jugar"+"\n"+
                    "1. Teclado Manual"+"\n"+
                    "2. Combinacíon Aleatorio"+"\n" +
                    "0. Salir"+"\n"
            );
    }

    public static void menuModalidad() {
            System.out.println(
                    "MODALIDAD DE JUEGO" +"\n"
                    +"\n"+
                    "1. Juego único"+"\n"+
                    "2. Jugar hasta obtener premio"+"\n"+
                    "3. Jugar hasta obtener premio (sin reintegro)"+"\n"+
                    "4. Ciclo de 10000 sorteos"+"\n"+
                    "5. Jugar hasta obtener premio categoría especial"
            );

    }

    public static void mirarResultado( int[] premios){
        System.out.println("Estos son los resultados");
        System.out.println("Especial: " + premios[6]);
        System.out.println("Premio 1: " + premios[1]);
        System.out.println("Premio 2: " + premios[2]);
        System.out.println("Premio 3: " + premios[3]);
        System.out.println("Premio 4: " + premios[4]);
        System.out.println("Premio 5: " + premios[5]);
        System.out.println("Sin Premio: " + premios[0]);

    }

}
