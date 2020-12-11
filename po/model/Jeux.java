package po.model;

import java.util.Scanner;
import po.model.Heros;
import po.model.Monstres.*;
import po.model.Utilitaires.*;


/**
 *
 */
public class Jeux {


    public static void main(String[] args) {

    }

    /**
     * Default constructor
     */
    public Jeux() {
        Dongeon dongeon = new Dongeon();
        Heros heros  = new Heros();
    }

    public void useWeapon() {
        Heros hero = new Heros();
        Scanner input = new Scanner(System.in);
        System.out.println("Quelle arme souhaites-tu utiliser ?");
        String weapon = input.nextLine();

        if(weapon.equals("SWORD")) {
            System.out.println("J'attaque le barbare !");
            hero.useSword();
        }

        else if (weapon.equals("WATER_FLASK")) {
            System.out.println("J'attaque le magicien !");
            hero.useWater();
        }

        else {
            System.out.println("Tu n'as utilisé aucune arme...");
        }

    }
    public void finRound(){
        System.out.println(" pv");
        System.out.println(" dégats infligés");
        System.out.println(" pv du monstre");
        System.out.println("");
    }

    /**
     *
     */
    public void finJeux() {
        // TODO implement here
    }

}