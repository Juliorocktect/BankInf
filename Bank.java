import java.util.Random;

public class Bank {
    private Kunde kunden[];
    private int kundenZahl;

    public Bank() {
        this.kunden = new Kunde[1000];
        this.kundenZahl = 0;
    }

    public int neuerKunde(String name, String vorname, String anschrift) {
        this.kunden[kundenZahl + 1] = new Kunde(vorname, vorname, anschrift, getKundenNummer());
        kundenZahl++;
        return kunden[kundenZahl].getKundenNummer();
    }

    public void transaktion(Kunde kunde, double menge, Geldautomat automat) {
        final double kontoStandVorher = kunde.getGiro().getGeld();
        final int geldImAutomatenVorher = automat.getGeldvorrat();
        boolean verlauf = false;
        if (kunde.getGiro().geldAbheben(menge) && automat.geldAuszahlen((int) menge, kunde)) {
            return;
        }
        kunde.getGiro().
        // menge die abgebucht werden soll
        // geld vom automaten
        // methode von kunde
        // methode geldautomat
        // wenn beide true sind dann wird abgebucht
    }

    public Kunde getPerKundeNummer(int num) {
        int index = 0;
        for (int i = 0; i < kundenZahl; i++) {
            if (kunden[i].getKundenNummer() == num)
                index = i;
        }
        return kunden[index];
    }

    public int getKundenNummer() {
        Random rnd = new Random();
        int num = rnd.nextInt(4);
        if (!checkIfTaken(num))
            return num;
        return 0;
    }

    private boolean checkIfTaken(int num) {
        for (int i = 0; i < kundenZahl; i++) {
            if (kunden[i].getKundenNummer() == num) {
                return true;
            }
        }
        return false;
    }
}
