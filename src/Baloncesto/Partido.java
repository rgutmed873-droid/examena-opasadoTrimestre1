package Baloncesto;

import java.util.Arrays;
import java.util.Random;

public class Partido {

    Jugador [] equipo1 = new Jugador[5];
    Jugador [] equipo2 = new Jugador[5];


    /**
     * Constructor Vacio
     */
    public Partido() {
        //Equipo1
        for (int i = 0; i < equipo1.length; i++) {
            equipo1[i] = new Jugador();
        }
        //Equipo2
        for (int i = 0; i < equipo2.length; i++) {
            equipo2[i] = new Jugador();
        }
        jugarPartido();
    }

    /**
     * Constructor con ambos equipos
     * @param equipo1
     * @param equipo2
     */
    public Partido(Jugador [] equipo1, Jugador [] equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public Jugador[] getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Jugador[] equipo1) {
        this.equipo1 = equipo1;
    }

    public Jugador[] getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Jugador[] equipo2) {
        this.equipo2 = equipo2;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "equipo1=" + Arrays.toString(equipo1) +
                ", equipo2=" + Arrays.toString(equipo2) +
                '}';
    }


    //Metodo para jugar el partido
    public void jugarPartido() {
        //Inicio de las rondas del partido
        for (int i = 0; i <= 10; i++) {
            System.out.println("---- Ronda" + " " + i + "-------");
            //Recorro el equipo 1
            for (int j = 0; j < this.equipo1.length; j++) {
                Jugador jActual = this.equipo1[j];

                //La suerte de canastar
                int suerte = numerosAleatorios(100, 0);
                //USO EL GETTER para ver la habilidad del jugador
                if (suerte <= jActual.getProbabilidadAcierto()){
                    //ACIERTO: USO EL GET Y SET PARA AÑADIR UNO
                    jActual.setCanastasConseguidas(jActual.getCanastasConseguidas() + 1);
                }else {
                    //FALLO
                    jActual.setCanastasFalladas(jActual.getCanastasFalladas() + 1);
                }
            }

            for (int j = 0; j < this.equipo2.length; j++) {
                Jugador jActual = this.equipo2[j];
                int suerte = numerosAleatorios(100, 0);

                if (suerte <= jActual.getProbabilidadAcierto()){
                    jActual.setCanastasConseguidas(jActual.getCanastasConseguidas() + 1);
                }else {
                    jActual.setCanastasFalladas(jActual.getCanastasFalladas() + 1);
                }
            }

        }
    }

    private static int numerosAleatorios(int max, int min){
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
