package projet20;

import utils.ExceptionHandler;

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

        // Séparateur clair pour le calcul valide
        System.out.println("\n=== Test 1 : Calcul du salaire journalier avec des valeurs valides ===");
        Double salaireJournalier = ExceptionHandler.execute(
            () -> employe1.travailler(8, 15.5), 
            "Erreur lors du calcul du salaire journalier"
        );
        if (salaireJournalier != null) {
            System.out.println("Le salaire journalier de " + employe1.getNom() + " est : " + salaireJournalier + " €");
        }

        // Séparateur clair pour le calcul invalide
        System.out.println("\n=== Test 2 : Calcul du salaire avec des valeurs invalides ===");
        Double salaireInvalide = ExceptionHandler.execute(
            () -> employe1.travailler(-8, 15.5), 
            "Erreur lors du calcul avec des valeurs invalides"
        );
        if (salaireInvalide == null) {
            System.out.println("Impossible de calculer un salaire invalide.");
        }
    
    }
}
