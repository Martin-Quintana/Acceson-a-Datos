public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Enemigo esqueleto1 = new Esqueleto(200);

        Mago mago = new Mago(200,100) {
            @Override
            public int lanzarHechizo() {
                return 15;
            }
        }

        while(esqueleto1.get >= 0){

        }
    }
}