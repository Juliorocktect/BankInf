#pragma once
#include "Kunden.hpp"
#include <map>

class Bank
{
  private: 
    std::map<Kunden,int> kunden; 
    int neueKundenNummer();
  public:
    void neuerKunde(char* name,char* vorname,char* anschrift);
    void transaktion(int kundenNummer,Geldautomat* automat);
};
