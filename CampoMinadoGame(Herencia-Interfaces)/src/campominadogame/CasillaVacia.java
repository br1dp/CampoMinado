package campominadogame;

public class CasillaVacia extends Casilla implements IPisable {

    public CasillaVacia() {
    }

    @Override
    public Character alPisar(Jugador jugador) {
        
        return 'J';

    }

    @Override
    public Character mostrar() {
        
        return '.';
    }

    @Override
    public Boolean esPeligrosa() {
        return false;
    }

    @Override
    public String tipo() {
        return "Vacia";
    }

}
