public class Enemigo {

    final int PV_MAX;
    int pv;

    public Enemigo(int pvMax){
        this.PV_MAX = pvMax;
        pv = this.PV_MAX;
    }

    public static int atacar() {
        int baseDamage = 10;
        return baseDamage;
    }
}
