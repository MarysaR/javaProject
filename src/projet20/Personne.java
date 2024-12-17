package projet20;

public class Personne {
  private String nom;

  // Constructeur
  public Personne(String nom) {
      this.nom = nom;
  }

  // Getter pour nom
  public String getNom() {
      return nom;
  }

  // Méthode d'affichage
  public void afficher() {
      System.out.println("Personne : " + nom);
  }
}
