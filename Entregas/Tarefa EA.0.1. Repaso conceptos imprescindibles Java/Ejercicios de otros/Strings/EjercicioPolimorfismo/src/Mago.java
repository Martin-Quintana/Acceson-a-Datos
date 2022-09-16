public abstract class Mago {
    final int PV_MAX;
    final int PM_MAX;
    int pv;
    int pm;

    public Mago(int pvMax, int pmMax) {
        this.PV_MAX = pvMax;
        this.PM_MAX = pmMax;
        pv = this.PV_MAX;
        pm = this.PM_MAX;
    }

    public abstract int lanzarHechizo();

}
