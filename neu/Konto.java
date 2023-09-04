public class Konto {
    private int kontonr;
    private int geld;
    private Kunde inhaber;

    public Konto(int kontonr,Kunde inhaber) {
        this.kontonr = kontonr;
        this.inhaber = inhaber;
        geld = 0;
    }

    int getKontonr() {
        return kontonr;
    }

    int getGeld() {return geld;}

    public Kunde getInhbaber(){return inhaber;}

}