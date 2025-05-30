package campominadogame;

public abstract class Casilla implements IPisable{

    public Casilla() {
    }

    public abstract Character mostrar();

    public abstract Boolean esPeligrosa();
    
    public abstract String tipo();
}
