package proyectoPrimitiva;

import proyectoPrimitiva.util.Bombo;
import proyectoPrimitiva.util.Metodos;
import proyectoPrimitiva.config.Config;

import java.util.Scanner;

public class Extracciones {
    Scanner lector = new Scanner(System.in);
    int[] array = new int[Config.NUMERO_EXTRACCIONES];

    //Creamos el numero del reintegro
    public int reintegro() {
        return Metodos.randomInt(9,1);
    }

    //Creamos la combinacion con un array de int
    public int[] combinacionAleatorio() {
        Bombo bombo = new Bombo(49,1);
        for(int i = 0;i<array.length;i++) {
            array[i] = bombo.extraerBola(); //rellenamos el array con bolas del bombo
        }
        return array;
    }
    public int[] combinacionImput() {
        Bombo bombo = new Bombo(49,1);
        boolean correcto = false;
        for(int i = 0;i<array.length;i++) {
            do {
                System.out.println("Dime el numero " + i);
                array[i] = Integer.parseInt(lector.nextLine()); //rellenamos el array con imput
                if(array[i] <= 49 && array[i] >= 1){
                    correcto = true;
                    for(int j = 0;j<array.length;j++) {
                        if(array[i] == array[j])
                            correcto = false;
                    }
                }
            }while (correcto == true);
        }
        return array;
    }

    public int complemetarioAleatorio() {
        Bombo bombo = new Bombo(43,1); //no pueden salir los numeros que ya han salido
        int comp = bombo.extraerBola();
        for(int i = 0;i<array.length;i++){
            if(comp==array[i]) {       //si algun numero del array coincide con el complementario
                complemetarioAleatorio();    //generado se genera otro hasta que no coincida
            }
        }
        return comp;
    }

    public int complemetarioImput() {
        int comp = 0;
        boolean correcto = false;
        for(int i = 0;i<array.length;i++){
            do {
                System.out.println("Dime el numero " + i);
                comp = Integer.parseInt(lector.nextLine()); //rellenamos el array con imput
                if(array[i] <= 49 && array[i] >= 1){
                    return comp;
                }
            }while (correcto == true);
        }
        return comp;
    }
}
