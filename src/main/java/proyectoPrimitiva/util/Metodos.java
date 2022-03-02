package proyectoPrimitiva.util;

import java.util.Random;

public class Metodos {
    public static int [] randomizadorArraysInt(int a1[],int max,int min ){
        for(int i = 0;i<a1.length;i++){
            a1[i] = randomInt(max,min);
        }
        return a1;
    }
    public static double [] randomizadorArraysDouble(double a1[],double max,double min ){
        for(int i = 0;i<a1.length;i++){
            a1[i] = randomDouble(max,min);
        }
        return a1;
    }
    public static int randomInt(int max, int min){
        Random rnd = new Random();
        return rnd.nextInt(max-min)+min;
    }

    public static long randomLong(long max, long min){
        Random rnd = new Random();
        return min + (long) (Math.random() * (max - min));
    }

    public static double randomDouble(double max, double min){
        Random rnd = new Random();
        return rnd.nextDouble()*(max-min)+min;
    }

    public static float randomFloat(float max, float min){
        Random rnd = new Random();
        return rnd.nextFloat()*(max-min)+min;
    }

    public static double[] reverseArray(double[] a1) {
        double[] a2 = new double[a1.length];
        int cont = 0;
        for(int i = a1.length-1;i>=0;i--) {
            a2[cont++] = a1[i];
        }
        return a2;
    }
    public static void visualizarArrayDouble(double[] vector) {
        for(int i = 0; i<vector.length;i++) {
            System.out.printf("%.4f\n",vector[i]);
        }
    }
    public static void visualizarArrayInt(int[] vector) {
        for(int i = 0;i<vector.length;i++){
            System.out.println(vector[i]);
        }
    }
    public static void clearScreen(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\u001B[H\u001B[2J");
        System.out.flush();
    }


}
