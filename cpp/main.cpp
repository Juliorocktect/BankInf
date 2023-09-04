#include <iostream>

template <class T>
class Data
{
private:
    T data;

public:
    Data(T data)
    {
        this->data = data;
    }
    T getData()
    {
        return data;
    }
};

int main(int argc, char *argv[])
{
    // Bank erstellen
    // Benutzer und konten liegen dort
    // Benutzer hebt bei einem Automaten ab
    // pin wird abgefragt
    // Automat kontaktiert Bank
    // transaktion findet statt
    //aufgabe erledigt
    Data<double> data(0.5);
    std::cout << data.getData() << "\n";
    return 0;
}
