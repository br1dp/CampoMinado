package campominadogame;

import java.util.Random;

public class Mapa {

    private Casilla mapa[][];
    private final Integer TAMFISICO;
    private Jugador jugador;

    public Mapa(Integer TAMFISICO) {

        this.jugador = new Jugador();
        this.TAMFISICO = TAMFISICO;
        this.mapa = new Casilla[TAMFISICO][TAMFISICO];
    }

    public void actualizarMapa() {

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

    }

    public Casilla[][] crearMapa() {

        Random rd = new Random();
        Integer contadorPuertas = 0;
        Integer aleatorio;

        for (int i = 0; i < TAMFISICO; i++) {

            for (int j = 0; j < TAMFISICO; j++) {

                aleatorio = rd.nextInt(1, 10);

                if (aleatorio == 2) {
                    this.mapa[i][j] = new Bomba();
                    
                } else {
                    this.mapa[i][j] = new CasillaVacia();
                }

            }
        }

        this.mapa[0][0] = new PuertaSalida();
        contadorPuertas++;
        this.mapa[9][9] = new CasillaVacia();

        return mapa;
    }

    public void mostrarMapa() {

        for (int i = 0; i < TAMFISICO; i++) {

            System.out.print("| ");

            for (int j = 0; j < TAMFISICO; j++) {

                if (i == this.jugador.getY() && j == this.jugador.getX()) {

                    if (j == TAMFISICO - 1) {
                        
                        System.out.print(this.mapa[i][j].alPisar(this.jugador)+" ");
                        System.out.println("|");
                        
                    } else {
                        
                        System.out.print(this.mapa[i][j].alPisar(this.jugador) + "  ");
                        
                    }

                } else if (j == TAMFISICO - 1) {

                    System.out.print(this.mapa[i][j].mostrar());
                    System.out.println(" |");

                } else {

                    System.out.print(this.mapa[i][j].mostrar() + "  ");

                }

            }

        }

    }

    public void turnoJugador() {
        this.jugador.mover();
        this.mapa[jugador.getY()][jugador.getX()].alPisar(jugador);
    }

}
