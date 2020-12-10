package po.model.Monstres;

import po.model.Monstres.Barbares;
import po.model.Monstres.Démons;

/**
 * 
 */
public class Monstre {


    private final Object Barbares;
    private final Object Démons;

    /**
     * Default constructor
     */
    public Monstre() {
        float mob = (float) Math.random();
        if (mob > 0.5){
            Barbares = new Barbares();

        }
        else {
            Démons = new Démons();
        }
    }




    /**
     * 
     */
    public static void genMob() {
        // TODO implement here
    }

}