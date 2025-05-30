package campominadogame;

import java.util.Random;
import java.util.Scanner;

public class Jugador {
    Random rd = new Random();
    
    private Integer x = rd.nextInt(0,10), y = 9;
    private Boolean vivo = true;
    
    public Jugador() {
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Boolean getVivo() {
        return vivo;
    }

    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }

    public void mover() {

        Scanner sc = new Scanner(System.in);
        String tecla;
        tecla = sc.next();

        switch (tecla) {

            case "w":
                this.y--;
                break;
            case "s":
                this.y++;
                break;
            case "a":
                this.x--;
                break;
            case "d":
                this.x++;
                break;

        }
        
    }

}
