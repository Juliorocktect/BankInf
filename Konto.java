public abstract class Konto {
    private int nummer;
    private double geld;

    public Konto() {
        this.nummer = 0;
        this.geld = 0.0;
    }

    public boolean geldAbheben(double menge) {
        if (menge > 0 && (geld - menge) > 0) {
            geld -= menge;
            return true;
        }
        return false;
    }

    public double getGeld() {
        return geld;
    }

    public int getNummer() {
        return nummer;
    }
}
