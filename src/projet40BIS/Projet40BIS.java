package projet40BIS;

public class Projet40BIS {
    public static void main(String[] args) {
        // Tableau d'entiers pour les tests
        int[] tableau = { 2, 4, 6, 8 };

        // Lambda pour calculer la somme des entiers
        Calculateur somme = (tab) -> {
            int resultat = 0;
            for (int valeur : tab) {
                resultat += valeur;
            }
            return resultat;
        };

        // Lambda pour calculer le produit des entiers
        Calculateur produit = (tab) -> {
            int resultat = 1;
            for (int valeur : tab) {
                resultat *= valeur;
            }
            return resultat;
        };

        // Lambda pour calculer la moyenne des entiers
        Calculateur moyenne = (tab) -> {
            if (tab.length == 0) return 0; // Évite la division par zéro
            int sommeTemp = 0;
            for (int valeur : tab) {
                sommeTemp += valeur;
            }
            return sommeTemp / tab.length;
        };

        // Exécution des lambdas et affichage des résultats
        System.out.println("=== Résultats avec Lambdas ===");
        System.out.println("Somme des entiers : " + somme.calculer(tableau));
        System.out.println("Produit des entiers : " + produit.calculer(tableau));
        System.out.println("Moyenne des entiers : " + moyenne.calculer(tableau));
    }
}
