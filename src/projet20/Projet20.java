package projet20;

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

      // Appel de la méthode demanderFormation pour chaque employé du tableau Employe[]
      System.out.println("\n=== Appel de demanderFormation ===");
      for (Employe employe : tableauEmployes) {
          employe.demanderFormation("Java Avancé");
      }
      // Appel de la méthode travailler pour employe1
      System.out.println("\n=== Calcul du salaire journalier ===");
      double salaireJournalier = employe1.travailler(8, 15.5); // Exemple : 8 heures à 15.5€/h
      System.out.println("Le salaire journalier de " + employe1.getNom() + " est : " + salaireJournalier + " €");
      }
}
