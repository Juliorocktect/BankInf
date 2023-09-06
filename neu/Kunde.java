class Kunde{
private String vorname,name,addresse;
private int kundenNummer, gebDatum;

public Kunde(String vorname,String name, String addresse,int kundenNummer,int gebDatum)
{
    this.vorname = vorname;
    this.name = name;
    this.addresse = addresse;
    this.gebDatum = gebDatum;
    this.kundenNummer = kundenNummer;
}
public void einzahlen(int betrag,int kontoNr){}
public void auszahlen(int betrag,int kontoNr){}
public void abheben(int betrag,int pin){}
public void überweisen(){}
}

