import java.util.Random;

public class Kunde {
    private int kundenNummer;
    private String name;
    private String vorname;
    private String anschrift;
    private Giro giroKonto;
    private Sparkonto sparKonto;

    public Kunde(String vorname, String name, String anschrift, int kundenNummer) {
        Random rnd = new Random();
        this.vorname = vorname;
        this.name = name;
        this.anschrift = anschrift;
        this.kundenNummer = kundenNummer;
        this.giroKonto = new Giro();
        this.sparKonto = new Sparkonto();
    }

    public int getKundenNummer() {
        return kundenNummer;
    }

    public Giro getGiro() {
        return giroKonto;
    }
}
