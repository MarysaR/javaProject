package projet20;

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

    // Méthode d'affichage (override)
    @Override
    public void afficher() {
        System.out.println("Employé : " + getNom() + ", ID : " + idEmploye);
    }
}
