package modell;

import nezet.KartyaTrukkKonzolon;

public class Pakli {

    String[] pakli = new String[22];
    KartyaTrukkKonzolon kt = new KartyaTrukkKonzolon();

   public Pakli() {
        feltolt();
    }

    public void feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int i = 1;
        for (String szin : szinek) {
            for (int e = 0; e < ertekek.length && i < pakli.length; e++) {
                pakli[i++] = szin + "_" + ertekek[e];
            }

        }
    }


public void kirak() {
        for (int i = 1; i < pakli.length; i++) {
           // System.out.printf("%-8s", pakli[i]);
           kt.formazottanKiir(""+pakli[i]);
            if (i % 3 == 0) {
                kt.kiir("");
            }
        }
    }

    public void kever(int oszlop) {

        String[] ujPakli = new String[22];
        switch (oszlop) {
            case 1:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = pakli[20 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[19 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[21 - (i - 1) * 3];
                }
                break;
            case 2:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = pakli[19 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[20 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[21 - (i - 1) * 3];
                }
                break;
            case 3:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = pakli[19 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[21 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[20 - (i - 1) * 3];
                }
                break;
        }
        pakli = ujPakli;

    }

    public void ezVolt() {
        kt.kiir("A választott lap: " + pakli[11]);
    }

}
