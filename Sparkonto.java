public class Sparkonto extends Konto {
    private int zinssatz;

    public Sparkonto() {
        super();
        this.zinssatz = 0;
    }

    public int getZinssatz() {
        return zinssatz;
    }
}
