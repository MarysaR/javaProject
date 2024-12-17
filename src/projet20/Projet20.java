package projet20;

import utils.exceptions.ExceptionHandler;
import utils.errors.Err;
import utils.errors.Ok;
import utils.errors.Result;

public class Projet20 {
    public static void main(String... args) {
        // Création des objets
        Employe employe1 = new Employe("Mary Reh", "EM173");
        Personne employe2 = new Employe("Renault Curie", "EM856");
        Personne personne1 = new Personne("Victor Hugo");

        // Tableau de type Personne[] contenant des Personne et des Employe
        Personne[] tableauPersonnes = { employe1, employe2, personne1 };

        // Tableau de type Employe[] contenant uniquement des Employe
        Employe[] tableauEmployes = { employe1, (Employe) employe2 };

        // Affichage des éléments du tableau Personne[]
        System.out.println("=== Tableau de type Personne ===");
        for (Personne personne : tableauPersonnes) {
            personne.afficher();
        }

        // Affichage des éléments du tableau Employe[]
        System.out.println("\n=== Tableau de type Employe ===");
        for (Employe employe : tableauEmployes) {
            employe.afficher();
        }

        // Test 1 : Calcul du salaire journalier avec des valeurs valides
        System.out.println("\n=== Test 1 : Calcul du salaire journalier avec des valeurs valides ===");
        Result<Double, String> salaireJournalierResult = ExceptionHandler.execute(
            () -> employe1.travailler(8, 15.5),
            "Erreur lors du calcul du salaire journalier"
        );

        if (salaireJournalierResult instanceof Ok) {
            System.out.println("Le salaire journalier de " + employe1.getNom() + " est : "
                + ((Ok<Double, String>) salaireJournalierResult).getValue() + " €");
        } else if (salaireJournalierResult instanceof Err) {
            System.out.println("Erreur : " + ((Err<Double, String>) salaireJournalierResult).getError());
        }

        // Test 2 : Calcul du salaire avec des valeurs invalides
        System.out.println("\n=== Test 2 : Calcul du salaire avec des valeurs invalides ===");
        Result<Double, String> salaireInvalideResult = ExceptionHandler.execute(
            () -> employe1.travailler(-8, 15.5),
            "Erreur lors du calcul avec des valeurs invalides"
        );

        if (salaireInvalideResult instanceof Ok) {
            System.out.println("Le salaire journalier de " + employe1.getNom() + " est : "
                + ((Ok<Double, String>) salaireInvalideResult).getValue() + " €");
        } else if (salaireInvalideResult instanceof Err) {
            System.out.println("Erreur : " + ((Err<Double, String>) salaireInvalideResult).getError());
        }
    }
}
