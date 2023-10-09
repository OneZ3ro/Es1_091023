package entities;

import exceptions.BancaException;

public class ContoCorrente {
    String titolare;
    int nMovimenti;
    final int maxMovimenti = 50;
    double saldo;

    ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        nMovimenti = 0;
    }

    void preleva(double x) throws BancaException {
        try {
            if (nMovimenti < maxMovimenti)
                saldo = saldo - x;
            else
                saldo = saldo - x - 0.50;
            if (saldo < 0) {
                throw new BancaException();
            }
        } catch (BancaException ex) {
            System.err.println("Il conto è in rosso!");
        } finally {
            nMovimenti++;
        }

    }

    double restituisciSaldo() {
        return saldo;
    }
}