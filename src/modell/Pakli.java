package modell;

import nezet.KartyaTrukkKonzolon;

public class Pakli {
    
    KartyaTrukkKonzolon kt = new KartyaTrukkKonzolon();
    private Lap lapok[];

    public Pakli() {
        lapok = new Lap[22];
        this.feltolt();
    }

    public Lap[] getLapok(){
        return lapok;
    }
    
    private void feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};

        int i = 1;

        for (String szin : szinek) {
            for (int e = 0; e < ertekek.length && i < this.lapok.length; e++) {
                Lap lap = new Lap(szin + "_" + ertekek[e]);
                lapok[i++] = lap;
            }
        }

    }

    public void kirak() {
        for (int i = 1; i < lapok.length; i++) {
            // System.out.printf("%-8s", pakli[i]);
            kt.formazottanKiir("" + lapok[i].getLeiras());
            if (i % 3 == 0) {
                kt.kiir("");
            }
        }
    }

    public void kever(int oszlop) {

        Lap[] ujPakli = new Lap[22];
        switch (oszlop) {
            case 1:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = this.lapok[20 - (i - 1) * 3];
                    ujPakli[i + 7] = this.lapok[19 - (i - 1) * 3];
                    ujPakli[i + 14] = this.lapok[21 - (i - 1) * 3];
                }
                break;
            case 2:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = this.lapok[19 - (i - 1) * 3];
                    ujPakli[i + 7] = this.lapok[20 - (i - 1) * 3];
                    ujPakli[i + 14] = this.lapok[21 - (i - 1) * 3];
                }
                break;
            case 3:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = this.lapok[19 - (i - 1) * 3];
                    ujPakli[i + 7] = this.lapok[21 - (i - 1) * 3];
                    ujPakli[i + 14] = this.lapok[20 - (i - 1) * 3];
                }
                break;
        }
        this.lapok = ujPakli;

    }

    public void ezVolt() {
        kt.kiir("A választott lap: " + this.lapok[11].getLeiras());
    }

}
