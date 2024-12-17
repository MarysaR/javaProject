package projet30;

import utils.errors.Err;
import utils.errors.Ok;
import utils.errors.Result;

public class Projet30 {
    public static void main(String[] args) {
        // Instance de CompteBancaire
        CompteBancaire compte = new CompteBancaire(500.0);

        // Retrait valide
        System.out.println("=== Retrait valide ===");
        afficherResultat(compte.retirerAvecHandler(250.0));

        // Montant négatif
        System.out.println("\n=== Retrait avec montant négatif ===");
        afficherResultat(compte.retirerAvecHandler(-50.0));

        // Montant nul
        System.out.println("\n=== Retrait avec montant nul ===");
        afficherResultat(compte.retirerAvecHandler(0.0));

        // Solde insuffisant
        System.out.println("\n=== Retrait avec solde insuffisant ===");
        afficherResultat(compte.retirerAvecHandler(400.0));
    }

    // Méthode pour afficher le résultat
    private static void afficherResultat(Result<Double, String> result) {
        if (result instanceof Ok) {
            System.out.println("Retrait réussi. Nouveau solde : " + ((Ok<Double, String>) result).getValue() + " €");
        } else if (result instanceof Err) {
            System.out.println("Erreur : " + ((Err<Double, String>) result).getError());
        }
    }
}
