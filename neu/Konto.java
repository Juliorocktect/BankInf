public class Konto {
    private int kontonr;
    private int geld;

    public Konto(int kontonr) {
        this.kontonr = kontonr;
        geld = 0;
    }

    int getKontonr() {
        return kontonr;
    }

    int getGeld() {
        return geld;
    }

}