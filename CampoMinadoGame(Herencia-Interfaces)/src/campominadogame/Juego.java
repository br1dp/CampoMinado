package campominadogame;

import java.util.Scanner;

public class Juego {

    public static void main(String[] args) {

        System.out.println("BIENVENIDO AL JUEGO");

        iniciar();

    }

    public static void iniciar() {
        Mapa mapa = new Mapa(10);
        mapa.crearMapa();
        Boolean ejecutar = true;

        while (ejecutar) {

            mapa.mostrarMapa();
            mapa.turnoJugador();
            mapa.actualizarMapa();
        }

    }
}
