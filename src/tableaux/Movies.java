package tableaux;

public class Movies {
  
  public static void main(String... args) {
    // 1. Tableau contenant les titres des films
    String[] films = {
        "Indiana Jones and the Last Crusade",
        "Indiana Jones and the Raiders of the Lost Ark",
        "Indiana Jones and the Temple of Doom"
    };

    // 2. Tableau à deux dimensions contenant les 3 principaux acteurs pour chaque film
    String[][] acteurs = {
        {"Harrison Ford", "Sean Connery", "Denholm Elliott"},
        {"Harrison Ford", "Karen Allen", "Paul Freeman"},
        {"Harrison Ford", "Kate Capshaw", "Ke Huy Quan"}
    };

    // 3. Boucle pour afficher les films et leurs acteurs
    for (int i = 0; i < films.length; i++) {
        System.out.print("Dans le film \"" + films[i] + "\", les principaux acteurs sont : ");
        for (int j = 0; j < acteurs[i].length; j++) {
            System.out.print(acteurs[i][j]);
            if (j < acteurs[i].length - 1) { // Ajoute une virgule sauf pour le dernier acteur
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
}
