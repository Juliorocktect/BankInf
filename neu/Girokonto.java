public class Girokonto extends Konto {
    private int dispo;

    public Girokonto(int kontoNr, int dispo,Kunde inhaber) {
        super(kontoNr,inhaber);
        this.dispo = dispo;
    }

    int getDispo() {
        return dispo;
    }

    void setDispo(int dispo) {
        this.dispo = dispo;
    }
}
