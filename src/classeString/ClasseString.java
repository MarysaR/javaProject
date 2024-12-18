package classeString;

public class ClasseString {
  public static void main(String[] args) {
    // Déclaration de strings
    String chaine1 = "Bonjour, monde!";
    String chaine2 = "  Java est génial!  ";
    String chaine3 = "12345";

    // 1. Comparaison de strings
    System.out.println("Comparaison avec equals : " + chaine1.equals("Bonjour, monde!"));
    System.out.println("Comparaison insensible à la casse : " + chaine1.equalsIgnoreCase("bonjour, MONDE!"));

    // 2. Conversion String vers types primitifs
    int nombre = Integer.parseInt(chaine3); // Convertir en int
    double decimal = Double.parseDouble("3.14"); // Convertir en double
    System.out.println("Conversion en int : " + nombre);
    System.out.println("Conversion en double : " + decimal);

    // 3. Extraction de strings
    System.out.println("Position de 'o' : " + chaine1.indexOf('o')); // Première occurrence
    System.out.println("Dernière position de 'o' : " + chaine1.lastIndexOf('o')); // Dernière occurrence
    System.out.println("Sous-chaîne (de 8 à 13) : " + chaine1.substring(8, 13)); // Partie de la string

    // 4. Propriétés de la string
    System.out.println("Longueur de la chaîne : " + chaine1.length());
    System.out.println("En minuscules : " + chaine1.toLowerCase());
    System.out.println("En majuscules : " + chaine1.toUpperCase());

    // 5. Suppression des espaces
    System.out.println("Avant trim : '" + chaine2 + "'");
    System.out.println("Après trim : '" + chaine2.trim() + "'");

    // 6. Vérification si la string est vide
    String chaineVide = "";
    System.out.println("La chaîne est-elle vide ? " + chaineVide.isEmpty());

    // 7. Remplacement de strings
    String chaineRemplacee = chaine1.replace("Bonjour", "Salut");
    System.out.println("Chaîne après remplacement : " + chaineRemplacee);

    // 8. Découper une string
    String[] mots = chaine1.split(", ");
    System.out.println("Découpage de la chaîne : ");
    for (String mot : mots) {
        System.out.println("- " + mot);
    }

    // 9. Représentation en string d'un objet
    int valeur = 42;
    String valeurChaine = String.valueOf(valeur); // Convertir int en String
    System.out.println("Représentation de la valeur : " + valeurChaine);

    // 10. Formater avec des motifs
    String formatage = String.format("La valeur est : %.2f", 123.456);
    System.out.println("Chaîne formatée : " + formatage);
}
}
