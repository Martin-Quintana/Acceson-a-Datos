public class Esqueleto extends Enemigo {

    public Esqueleto(int pvMax) {
        super(pvMax);
    }

    @Override
    public static int atacar() {
        int baseDamage = 15;
        return baseDamage;
    }

    public int getPv() {
        return this.pv;
    }
}
