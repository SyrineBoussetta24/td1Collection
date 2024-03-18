package ex1;

class Compte implements Comparable<Compte>{
    int numero;
    double solde;

    Compte(int numero) {
        this.numero = numero;
        solde = 0;
    }

    void retrait(double m) {
        solde = solde - m;
    }

    void depot(double m) {
        solde = solde + m;
    }

    @Override
    public int compareTo(Compte c) {
        return Double.compare(this.solde, c.solde);
    }
}
