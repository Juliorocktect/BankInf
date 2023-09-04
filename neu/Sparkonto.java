public class Sparkonto extends Konto {
    private int zinssatz;

    public Sparkonto(int kontoNr, int zinssatz,Kunde inhaber) {
        super(kontoNr,inhaber);
        this.zinssatz = zinssatz;
    }

    void setZinssatz(int zinssatz) {
        this.zinssatz = zinssatz;
    }

    int getZinssatz() {
        return zinssatz;
    }
}

