package projet40;

public class Projet40 {
    public static void main(String[] args) {
        // Création d'un tableau d'entiers pour les tests
        int[] tableau = { 2, 4, 6, 8 };

        // Test de la classe Somme
        Calculateur sommeCalculateur = new Somme();
        System.out.println("La somme des entiers est : " + sommeCalculateur.calculer(tableau));

        // Test de la classe Produit
        Calculateur produitCalculateur = new Produit();
        System.out.println("Le produit des entiers est : " + produitCalculateur.calculer(tableau));

        // Test de la classe Moyenne
        Calculateur moyenneCalculateur = new Moyenne();
        System.out.println("La moyenne des entiers est : " + moyenneCalculateur.calculer(tableau));
    }
}
