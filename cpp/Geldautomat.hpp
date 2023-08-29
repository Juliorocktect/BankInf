#pragma once

class Geldautomat
{
  private:
    int geldVorrat;
    Kunde aktuellerKunde;
    Bank* bank;
    void pinAufnehmen();
  public:
    Geldautomat(Bank bank);
    void karteEinziehen();  
  };
