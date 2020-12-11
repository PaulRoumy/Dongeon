package po.model;

import po.model.Monstres.Monstre;
import po.model.Utilitaires.Alea;
import po.model.Utilitaires.ExceptionVieFin;
import po.model.Utilitaires.Weapons;
import po.model.Utilitaires.Sword;

/**
 * 
 */
public class Heros {

    private int PV;
    private int PV_Depart;
    Sword sword;
    /**
     * Default constructor
     */
    public Heros() {
        sword = new Sword();
        int pv = 120;

    }

    public void set_PV ( int PV) throws ExceptionVieFin
    {
        if ( PV <= 0 )
        {
            throw new ExceptionVieFin("Le héros est mort.");
        }
        else
        {
            if ( PV <= this.PV_Depart )
                this.PV = PV;
            else this.PV = this.PV_Depart;
        }
    }
    public int get_PV()
    {
        return this.PV;
    }

    public String Bataille(Monstre Mo) throws ExceptionVieFin{
        int Degats_Heros,Degats_Monstre;
        StringBuffer Affichage = new StringBuffer();

        Degats_Heros = this.get_Attaque() + Alea.EntierEntre(1,6);
        Affichage.append("\nLe héros attaque et a une attaque de "+ Degats_Heros);
        Affichage.append("\nLe monstre riposte avec une défense de : "+ Mo.get_Defense());
        if ( Mo.get_Defense() <= Degats_Heros )
        {
            Affichage.append("\nLe monstre perd "+(this.ptDegat()).get_Puissance()+ "PV");
            Mo.set_PV(Mo.get_PV() - (this.get_Arme()).get_Puissance());
        }
        return Affichage.toString();
    }

    /**
     * 
     */
    public Weapons[] inventaire;

    /**
     * @param degat 
     * @param pralisie
     */
    public void ptDegat(int degat, boolean pralisie) {
        // TODO implement here
    }

    /**
     * @param Parameter1
     */




    /**
     * 
     */
    public int useSword() {
        int Degat = ptDegat(Sword.attack);

        return Degat;
    }

    private int ptDegat(int attack) {
        return attack;
    }

    /**
     * 
     */
    public void useWater() {
        // TODO implement here
    }

}