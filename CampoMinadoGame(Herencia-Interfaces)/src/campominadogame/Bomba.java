package campominadogame;

public class Bomba extends Casilla implements IPisable {

    public Bomba() {
    }

    @Override
    public Character mostrar() {
        return '*';
    }

    @Override
    public Boolean esPeligrosa() {
        return true;
    }

    @Override
    public Character alPisar(Jugador jugador) {
        
        return 'X';

    }
    
    @Override
    public String tipo(){
        return "Bomba";
    }

}
