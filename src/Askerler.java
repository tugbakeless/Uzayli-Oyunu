public class Askerler extends Dunyalilar {

    protected int damage;


    @Override
    public int gucHesapla() {
        return damage * defence;
    }
}
