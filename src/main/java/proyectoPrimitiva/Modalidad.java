package proyectoPrimitiva;

import proyectoPrimitiva.config.Config;
import proyectoPrimitiva.Extracciones;

public class Modalidad {

    int reintegroNum;
    int reintegroComb;
    int numComplementario;
    int combComplementario;
    int[] numero = new int[Config.NUMERO_EXTRACCIONES];
    int[] combinacion = new int[Config.NUMERO_EXTRACCIONES];
    boolean reintegrar = false;

    /**
     * Solo un juego, reintegro incluido
     */
    public void juegoUnico(){
        boolean ganar = false;
        int numerosGanadores = comprobador(reintegrar);
        if(numerosGanadores >= 3){
            ganar = true;
        }

    }

    /**
     * Juego hasta conseguir premio, reintegro permitido
     */
    public void juegoHastaPremio(){
        boolean ganar = false;
        int partidas = 0;
        do{
            int numerosGanadores = comprobador(reintegrar);
            if(numerosGanadores >= 3){
                ganar = true;
            }
            else{
                reintegrar = reintegro();
                if(reintegrar = true){
                    numerosGanadores = comprobador(reintegrar);
                    if(numerosGanadores >= 3){
                        ganar = true;
                    }
                    reintegrar = false;
                }
            }
            partidas++;
        }while (ganar == false);
    }

    /**
     * Juego hasta conseguir premio, reintegro prohibido
     */
    public void juegoHastaPremioNoReintregro(){
        boolean ganar = false;
        int partidas = 0;
        do{
            int numerosGanadores = comprobador(false);
            if(numerosGanadores >= 3){
                ganar = true;
            }
            partidas++;
        }while (ganar == false);

    }

    /**
     * 10000 partidas
     */
    public void juegoDiezMilSorteos(){
        int totalSorteos = 10000;
        int numerosGanadores;
        for(int i = 0; i < totalSorteos; i++){
            numerosGanadores = comprobador(false);
        }
    }

    /**
     * Juego hasta obtener premio categoria especial
     */
    public void juegoHastaPremioEspecial(){
        int numerosGanadores;
        boolean ganarReintegro;
        boolean resultado = false;
        do{
            numerosGanadores = comprobador(true);
            if(numerosGanadores == 6){
                ganarReintegro = reintegro();
                if(ganarReintegro == true){
                    System.out.println("Has ganado premio especial");
                    resultado = true;
                }
            }
        } while (resultado == false);
    }




    /**
     * Imprime resultado
     * @param reintegro devuelve si es posible el reintegro
     * @return devuelve si hay que reintegrarse
     */
    public boolean resultado(boolean reintegro){
        int numerosGanadores;
        int resultado;
        boolean ganarReintegro;
        numerosGanadores = comprobador(reintegro);
        if(numerosGanadores >= 3){
            switch (numerosGanadores){
                case 3:
                    System.out.println("Has ganado premio especial");
                    break;
                case 4:
                    System.out.println("Has ganado premio especial");
                    break;
                case 5:
                    System.out.println("Has ganado premio especial");
                    break;
                case 6:
                    ganarReintegro = reintegro();
                    if(ganarReintegro == true){
                        System.out.println("Has ganado premio especial");
                        break;
                    }
                    System.out.println("Has ganado premio especial");
                    break;
            }
            return false;
        }
            System.out.println("No has ganado nada");
        if(reintegro == true)
            return true;
        return true;
    }


    public int comprobador(boolean reintegro){

        if(reintegro == false){
            //todo escribir primitiva y aleatorio
        }
        else {
            //todo cambiar Extracciones.combinacion(); a static para que se pueda coger
            //numero = Extracciones.combinacion();
        }
        int numerosGandadores = 0;
        for (int i = 0; i < Config.NUMERO_EXTRACCIONES; i++){
            for (int j = 0; j < Config.NUMERO_EXTRACCIONES; j++){
                if(numero[i] == combinacion[j])
                    numerosGandadores++;
            }
        }
        return numerosGandadores;
    }

    public boolean reintegro(){
            if(reintegroNum == reintegroComb)
                return true;
        return false;
    }
}
