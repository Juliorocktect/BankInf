public class Girokonto extends Konto {
    private int dispo;

    public Girokonto(int kontoNr, int dispo) {
        super(kontoNr);
        this.dispo = dispo;
    }

    int getDispo() {
        return dispo;
    }

    void setDispo(int dispo) {
        this.dispo = dispo;
    }
}
