package po.model.Monstres;

import po.model.Héros;

/**
 * 
 */
public class Démons extends Monstre {

    /**
     * Default constructor
     */
    public Démons() {
        int pv = 30;
    }


    /**
     * @param cible
     */
    public void attaquer(Héros cible) {

    }

    /**
     * 
     */
    public String recupArme() {
        System.out.println("Utiliser le pouvoir de la vie!");
        return "EauMagique";
    }

    /**
     * @param degat
     */
    public void ptDegat(int degat) {
        // TODO implement here
    }

}