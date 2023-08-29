import java.util.Random;

public class Giro extends Konto {
    private int pin;
    private KontoStatus status;

    public Giro() {
        this.pin = new Random().nextInt(4);

    }

    private boolean checkPin(int pin) {
        return this.pin == pin && status == KontoStatus.active;
    }

    public boolean geldAbheben(double menge, int pin) {
        if (checkPin(pin) && super.geldAbheben(menge)) {
            return true;
        }
        return false;
    }

    public void setStatus(KontoStatus status) {
        this.status = status;
    }
}
