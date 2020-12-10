package po.model.Monstres;

import;

/**
 * 
 */
public class Monstre {

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