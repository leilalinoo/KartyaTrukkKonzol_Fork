package nezet;

import modell.Pakli;
import java.util.Scanner;

public class KartyaTrukkKonzolon {

   private static String[] pakli = new String[22];
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Pakli pakli2 = new Pakli();
        pakli2.feltolt();
        
        for (int i = 0; i < 3; i++) {
            pakli2.kirak();
            int oszlop = melyik();
            pakli2.kever(oszlop);
        }
        
        pakli2.ezVolt();
    }

   

    private static int melyik() {
        boolean jo;
        int oszlop;
        do {
            kiir("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }
    
    public static void kiir(String szoveg){
        System.out.println(szoveg);
    }
    
    public static void formazottanKiir(String szoveg){
        System.out.printf("%-8s", szoveg);
    }
    

}
