public class Bank
{
    private Kunde kunden[];
    private int kundenAnzahl;
    private Konto konten[];
    private int kontoAnzahl;
    public Bank()
    {
        kunden = new Kunde[1000];
        kundenAnzahl = 0;
        konten = new Konto[1000];
        kontoAnzahl = 0;
    }
    public void neuerKunde(String name,String vorname,String adresse,int gebDatum)
    {
        if(kundenAnzahl < 1000)
        {
        int kundenNr = kundenAnzahl+1000;
        String nummer = Integer.toString(kundenNr);
        nummer.at(0) = "0";
        kunden[kundenAnzahl] = new Kunde(name,vorname,adresse,kundenAnzahl+1,gebDatum);
        kundenAnzahl++;
        }
        else{
            System.out.println("Kann nicht mehr kunden anlegen");
        }
    }
    public void neuesKonto(char art,Kunde inhaber)
    {
        if (art == 'g')
        {
            konten[kontoAnzahl] = new Girokonto(kontoAnzahl,15,inhaber);
            kontoAnzahl++;
            return;
        }
        konten[kontoAnzahl] = new Sparkonto(kontoAnzahl,1,inhaber);
        kontoAnzahl++;
    }
}
