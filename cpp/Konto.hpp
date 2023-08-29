#pragma once

enum KontoStatus {
  active,
  deactive
};

class Konto {
private:
  int nummer;
  double geld;
public:
  Konto();
  int getNummer();
  double getKontoStand();
  bool abheben(double menge);
  void setKontoStatus(KontoStatus status);
};

class Giro:Konto{
private:
  int pin;
  Giro();
public:
  bool checkPin(int pin);
};

class Spar:Konto{
private:
  int zinssatz;
public: 
  Spar();
};
