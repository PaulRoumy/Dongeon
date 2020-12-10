package po.model;

import po.model.Dongeon;
import po.model.Héros;
import java.util.Scanner;

/**
 *
 */
public class Jeux {
    public static void main(String[] args) {

    }
    private final Object Dongeon;
    private final Object Héros;

    /**
     * Default constructor
     */
    public Jeux() {
        Dongeon = new Dongeon();
        Héros = new Héros();
    }

    public void useWeapon() {
        Héros hero = new Héros();
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

    /**
     *
     */
    public void finJeux() {
        // TODO implement here
    }

}