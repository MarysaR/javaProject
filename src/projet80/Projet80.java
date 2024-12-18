package projet80;

import java.util.*;
import java.util.stream.Collectors;

public class Projet80 {
    public static void main(String[] args) {
        // Liste de strings
        List<String> chaines = new ArrayList<>(Arrays.asList(
            "Java", "Stream", "API", "Lambda", "Code", "exemple", "Interface", "fonctionnelle"
        ));

        // Affiche la première lettre de chaque string
        System.out.println("Première lettre de chaque string :");
        chaines.stream()
            .map(s -> s.substring(0, 1)) // Extrait la première lettre
            .forEach(System.out::println);

        // Supprime toutes les strings commençant par une lettre majuscule
        List<String> sansMajuscule = chaines.stream()
            .filter(s -> !Character.isUpperCase(s.charAt(0))) // Exclu celles commençant par une majuscule
            .collect(Collectors.toList());
        System.out.println("Liste sans strings commençant par une majuscule : " + sansMajuscule);

        // Met en majuscule les strings contenant plus de trois lettres
        List<String> majusculesAppliquees = chaines.stream()
            .map(s -> s.length() > 3 ? s.toUpperCase() : s)
            .collect(Collectors.toList());
        System.out.println("Liste avec strings > 3 lettres en majuscule : " + majusculesAppliquees);
    }
}
