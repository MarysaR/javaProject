package projet40;

public class Produit implements Calculateur {
    @Override
    public int calculer(int[] tableau) {
        int produit = 1;
        for (int valeur : tableau) {
            produit *= valeur;
        }
        return produit;
    }
}
