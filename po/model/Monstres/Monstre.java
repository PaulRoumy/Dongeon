package po.model.Monstres;


/**
 * 
 */
public class Monstre {

    private int Attaque;
    private boolean Alive;
    private int Defense;
Monstre monstre;
    /**
     * Default constructor
     */
    public Monstre() {

        float mob = (float) Math.random();
        if (mob > 0.5){
            monstre = new Barbares();

        }
        else {
            monstre = new Magiciens();
        }
    }


    public final int get_Attaque()
    {
        return Attaque;
    }

    public final int get_Defense()
    {
        return Defense;
    }

    public boolean get_Alive()
    {
        return this.Alive;
    }


    /**
     * 
     */
    public static void genMob() {
        // TODO implement here
    }

}