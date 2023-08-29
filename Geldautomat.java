import java.util.Scanner;

public class Geldautomat {
    private int geldvorrat;
    private Bank bank;
    private Kunde aktuellerKunde;
    private int pin;

    public Geldautomat(Bank bank) {
        this.bank = bank;
        this.geldvorrat = 1000000;
    }

    public int getGeldvorrat() {
        return geldvorrat;
    }

    public boolean geldAuszahlen(int menge, Kunde kunde) {
        this.aktuellerKunde = kunde;
        bank.transaktion(kunde, menge, this);
        if (menge > 0 && (geldvorrat - menge) > 0) {
            pinAufnehmen();
            if (kunde.getGiro().geldAbheben(menge, pin)) {
                geldvorrat -= menge;
            }
            return true;
        }
        return false;
    }

    private void pinAufnehmen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pin eingeben");
        pin = scanner.nextInt();
        scanner.close();
    }

    private void karteEinziehen() {
        aktuellerKunde.getGiro().setStatus(KontoStatus.deactive);
    };
}
