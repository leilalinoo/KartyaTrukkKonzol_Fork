package kartyatrukkkonzolon;

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
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }
    

}
