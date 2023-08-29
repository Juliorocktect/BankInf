class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Geldautomat automat = new Geldautomat(bank);
        int num = bank.neuerKunde("Julius", "Klu", "Straße 123");
        automat.geldAbheben(23, bank.getPerKundeNummer(num));
    }
}
