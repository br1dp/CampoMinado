package campominadogame;

public class PuertaSalida extends Casilla implements IPisable {

    public PuertaSalida() {
    }

    @Override
    public Character alPisar(Jugador jugador) {
       return 'J';

    }

    @Override
    public Character mostrar() {
        return 'S';
    }

    @Override
    public Boolean esPeligrosa() {
        return false;
    }

    @Override
    public String tipo() {
        return "Puerta";
    }

}
