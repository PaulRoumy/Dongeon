package po.model.Utilitaires;
import java.util.*;

/**
 * 
 */
public class Epée {

    public static int attack;

    /**
     * Default constructor
     */

    public Epée() {
    }



    /**
     * @return
     */
    public int attack() {
        int degat=10;
        float critique = (float) Math.random();
        if (critique <= 0.3){
            degat = degat *2;
        }
        return degat;
    }

    /**
     * 
     */
    public void gestionCrit() {
        // TODO implement here
    }

    /**
     * 
     */
    public int attackHero() {
        int degat = 10;
        return degat;
    }

    /**
     * 
     */
    public boolean Paralisie() {
        float paralisie =(float)Math.random();
        if (paralisie <= 0.1){
            return true;
        }
        return false;
    }

}