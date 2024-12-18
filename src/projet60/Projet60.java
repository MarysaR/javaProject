package projet60;

import java.util.*;
import java.util.function.Consumer;

public class Projet60 {
    public static void main(String[] args) {
        // Liste des huit planètes du système solaire
        List<String> planetes = Arrays.asList(
            "Mercure", "Vénus", "la Terre", "Mars", "Jupiter", "Saturne", "Uranus", "Neptune"
        );

        // Planètes géantes gazeuses exclues
        Set<String> geantesGazeuses = new HashSet<>(Arrays.asList("Jupiter", "Saturne", "Uranus", "Neptune"));

        // Consumer - affiche les noms en majuscules
        Consumer<String> afficherMajuscules = planete -> {
            if (!geantesGazeuses.contains(planete)) {
                System.out.println(planete.toUpperCase());
            }
        };

        // Parcours et applique Consumer sur chaque planète
        planetes.forEach(afficherMajuscules);
    }
}