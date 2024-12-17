package projet40;

public class Moyenne implements Calculateur {
    @Override
    public int calculer(int[] tableau) {
        if (tableau.length == 0) return 0; // Évite la division par zéro
        int somme = 0;
        for (int valeur : tableau) {
            somme += valeur;
        }
        return somme / tableau.length;
    }
}
