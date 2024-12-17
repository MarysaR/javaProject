package projet20;

public class Projet20 {
    public static void main(String... args) {
        // Création des objets
        Employe employe1 = new Employe("Mary Reh", "EM173");
        Personne employe2 = new Employe("Renault Curie", "EM856");

        // Création d'un tableau contenant les deux objets
        Personne[] tableauPersonnes = { employe1, employe2 };

        // Affichage des éléments du tableau
        for (Personne personne : tableauPersonnes) {
            personne.afficher();
        }

        // Appel de la méthode demanderFormation pour employe1
        employe1.demanderFormation("Java Avancé");
    }
}
