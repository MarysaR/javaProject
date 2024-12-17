package projet20;

import utils.errors.Err;
import utils.errors.Ok;
import utils.errors.Result;
import utils.exceptions.TarifException;

public class Employe extends Personne {
    private String idEmploye;

    // Constructeur
    public Employe(String nom, String idEmploye) {
        super(nom);
        this.idEmploye = idEmploye;
    }

    // Getter pour idEmploye
    public String getIdEmploye() {
        return idEmploye;
    }

    // Méthode demanderFormation
    public void demanderFormation(String titreFormation) {
        System.out.println("L'employé : \"" + getIdEmploye() + "\" demande formation : " + titreFormation);
    }

    // Méthode travailler
    public double travailler(int heuresTravaillees, double tarifHoraire) {
        if (heuresTravaillees < 0 || tarifHoraire < 0) {
            throw new IllegalArgumentException("Les heures ou le tarif ne peuvent pas être négatifs.");
        }
        return heuresTravaillees * tarifHoraire;
    }
    

    // Nouvelle méthode utilisant Result pour gérer les erreurs prévues
    public Result<Double, String> calculerSalaireResult(int heures, double tarif) {
        if (heures < 0) {
            return Err.of("Le nombre d'heures ne peut pas être négatif.");
        }
        if (tarif < 0) {
            return Err.of("Le tarif horaire ne peut pas être négatif.");
        }
        return Ok.of(heures * tarif);
    }

    // Nouvelle méthode utilisant TarifException pour les erreurs critiques
    public double calculerSalaireCritique(int heures, double tarif) throws TarifException {
        if (heures < 0 || tarif < 0) {
            throw new TarifException("Erreur critique : heures ou tarif horaire négatifs !");
        }
        return heures * tarif;
    }

    // Méthode d'affichage (override)
    @Override
    public void afficher() {
        System.out.println("Employé : " + getNom() + ", ID : " + idEmploye);
        // super.afficher();
    }
}
