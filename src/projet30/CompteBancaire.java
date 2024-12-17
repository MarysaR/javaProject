package projet30;

import utils.errors.Err;
import utils.errors.Ok;
import utils.errors.Result;
import utils.exceptions.ExceptionHandler;

public class CompteBancaire {
    private double solde;

    // Constructeur
    public CompteBancaire(double soldeInitial) {
        this.solde = soldeInitial;
    }

    // Méthode retirer avec Result pour gérer les erreurs
    public Result<Double, String> retirer(double montant) {
        if (montant <= 0) {
            return Err.of("Montant invalide : le montant doit être strictement positif.");
        }
        if (montant > solde) {
            return Err.of("Solde insuffisant pour effectuer le retrait.");
        }
        solde -= montant;
        return Ok.of(solde);
    }

    // Méthode pour utiliser ExceptionHandler et Result
    public Result<Double, String> retirerAvecHandler(double montant) {
        return ExceptionHandler.execute(() -> {
            if (montant <= 0) {
                throw new IllegalArgumentException("Montant invalide");
            }
            if (montant > solde) {
                throw new IllegalStateException("Solde insuffisant");
            }
            solde -= montant;
            return solde;
        }, "Erreur lors du retrait");
    }

    // Getter pour le solde
    public double getSolde() {
        return solde;
    }
}
