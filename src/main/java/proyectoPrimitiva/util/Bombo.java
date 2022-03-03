package proyectoPrimitiva.util;

import java.util.Random;

public class Bombo {
    private final int[] array;
    private int validos;
    private final Random random;

    public Bombo(int max, int min) {
        random = new Random();
        array = new int[max];
        for(int i = 0; i < array.length; i++) {
            array[i] = min;
            min++;
        }
        validos = max - 1;
    }

    public int extraerBola() {
        if(validos >= 0) {
            int indice = random.nextInt(validos + 1);
            int numero = array[indice];
            array[indice] = array[validos];
            array[validos] = numero;
            validos--;
            return numero;
        }
        return Integer.MIN_VALUE;
    }

    public void reset() {
        validos = array.length - 1;
    }
}