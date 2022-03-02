package proyectoPrimitiva;

import proyectoPrimitiva.util.Bombo;
import proyectoPrimitiva.util.Metodos;
import proyectoPrimitiva.config.Config;

public class Extracciones {
    int[] array = new int[Config.NUMERO_EXTRACCIONES];

    //Creamos el numero del reintegro
    public int reintegro() {
        return Metodos.randomInt(9,1);
    }

    //Creamos la combinacion con un array de int
    public int[] combinacion() {
        Bombo bombo = new Bombo(49,1);
        for(int i = 0;i<array.length;i++) {
            array[i] = bombo.extraerBola(); //rellenamos el array con bolas del bombo
        }
        return array;
    }

    public int complemetario() {
        Bombo bombo = new Bombo(43,1); //no pueden salir los numeros que ya han salido
        int comp = bombo.extraerBola();
        for(int i = 0;i<array.length;i++){
            if(comp==array[i])       //si algun numero del array coincide con el complementario
                complemetario();    //generado se genera otro hasta que no coincida
        }
        return comp;
    }
}
