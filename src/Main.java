import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random rnd = new Random();
        Dunyalilar d1 = new Dunyalilar();
        Askerler a1 = new Askerler();
        Ciftci c1 = new Ciftci();
        Cyborg cyb = new Cyborg();
        Madenci mdn = new Madenci();
        Uzaylilar u1 = new Uzaylilar();


        int points = 0;
        int toplamd = 0;
        int toplamu = 0;
        int total = 0;

        for (int i = 0; i < 500; i++) {
            d1.defence = rnd.nextInt(11);
            u1.defence= rnd.nextInt(11);
            a1.damage = rnd.nextInt(11);
            c1.products = rnd.nextInt(11);
            cyb.laserP = rnd.nextInt(11);
            mdn.mine = rnd.nextInt(11);


            toplamd = a1.gucHesapla() + c1.gucHesapla();

            toplamu = cyb.gucHesapla() + mdn.gucHesapla();
            points = toplamd - toplamu;

            System.out.println(i + 1 + ". elin puani " + points);
            total += points;
            System.out.println("Oyuna devam etmek istiyorsaniz herhangi bir rakama,cikmak icin -1'i tuslayiniz.");
            int sel = inp.nextInt();
            if (sel == -1) {
                System.out.println("Oyun bitti.");
                break;
            }



        }


        System.out.println("Toplam puaniniz: " + total);


    }
}