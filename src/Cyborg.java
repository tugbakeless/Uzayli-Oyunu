public class Cyborg extends Uzaylilar{
    protected int laserP;

    @Override
    public int gucHesapla() {
        return laserP*defence;
    }
}
