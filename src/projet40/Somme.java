package projet40;

public class Somme implements Calculateur {
    @Override
    public int calculer(int[] tableau) {
        int somme = 0;
        for (int valeur : tableau) {
            somme += valeur;
        }
        return somme;
    }
}
