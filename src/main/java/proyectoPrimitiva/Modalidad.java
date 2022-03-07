package proyectoPrimitiva;

import proyectoPrimitiva.config.Config;
import proyectoPrimitiva.Extracciones;

public class Modalidad {

    int[] reintegroNum = new int[Config.NUMERO_REINTEGRO];
    int[] reintegroComb = new int[Config.NUMERO_REINTEGRO];
    int[] numero = new int[Config.NUMERO_EXTRACCIONES];
    int[] combinacion = new int[Config.NUMERO_EXTRACCIONES];
    boolean reintegrar = false;

    public void juegoUnico(){
        boolean ganar = false;
        int numerosGanadores = comprobador(reintegrar);
        if(numerosGanadores >= 3){
            ganar = true;
        }
    }
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
    public void juegoDiezMilSorteos(){
        int totalSorteos = 10000;

    }
    public void juegoHastaPremioEspecial(){

    }


    //todo hacer un metodo que vea los numeros ganadores y lo diga

    public int resultado(boolean reintegro){
        int numerosGanadores = 0;
        boolean ganarReintegro;
        numerosGanadores = comprobador(reintegro);
        if(numerosGanadores >= 3){
            ganarReintegro = reintegro();
            if(ganarReintegro == true){
                //todo seguir
            }
        }
        if(reintegro == true){}
        return 1;
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
            if(reintegroNum[0] == reintegroComb[0])
                return true;
        return false;
    }
}
