package po.model.Monstres;

import po.model.Heros;

/**
 * 
 */
public class Magiciens extends Monstre {

    /**
     * Default constructor
     */
    public Magiciens() {
        int pv = 25;
    }


    /**
     * @param cible
     */
    public void attaquer(Heros cible) {

    }

    /**
     * 
     */
    public String recupArme() {
        System.out.println("Utiliser le pouvoir de la vie!");
        return "MagicWater";
    }

    /**
     * @param degat
     */
    public void ptDegat(int degat) {
        // TODO implement here
    }

}