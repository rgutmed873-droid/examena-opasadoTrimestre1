package Baloncesto;

import java.util.Random;

public class Jugador {

    public String nombreJugador = "";
    public int canastasConseguidas;
    public int probabilidadAcierto = probabilidadAcierto(100,20);
    public int canastasFalladas;

    /**
     * Constructor Vacío
     */
    public Jugador(){

    }

    /**
     * Constructor con todos los atributos del jugador
     * @param canastasFalladas
     * @param probabilidadAcierto
     * @param canastasConseguidas
     * @param nombreJugador
     */
    public Jugador(int canastasFalladas, int probabilidadAcierto, int canastasConseguidas, String nombreJugador) {
        this.canastasFalladas = canastasFalladas;
        this.probabilidadAcierto = probabilidadAcierto;
        this.canastasConseguidas = canastasConseguidas;
        this.nombreJugador = nombreJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getCanastasConseguidas() {
        return canastasConseguidas;
    }

    public void setCanastasConseguidas(int canastasConseguidas) {
        this.canastasConseguidas = canastasConseguidas;
    }

    public int getProbabilidadAcierto() {
        return probabilidadAcierto;
    }

    public void setProbabilidadAcierto(int probabilidadAcierto) {
        this.probabilidadAcierto = probabilidadAcierto;
    }

    public int getCanastasFalladas() {
        return canastasFalladas;
    }

    public void setCanastasFalladas(int canastasFalladas) {
        this.canastasFalladas = canastasFalladas;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombreJugador='" + nombreJugador + '\'' +
                ", canastasConseguidas=" + canastasConseguidas +
                ", probabilidadAcierto=" + probabilidadAcierto +
                ", canastasFalladas=" + canastasFalladas +
                '}';
    }

    private static int probabilidadAcierto(int max, int min){
        Random rand = new Random();
        return rand.nextInt(max-min+1)+min;
    }
}
