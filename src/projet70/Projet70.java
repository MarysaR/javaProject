package projet70;

import java.util.*;
import java.util.function.Supplier;

public class Projet70 {
    public static void main(String[] args) {
        // Création d'une liste de strings 
        List<String> chaines = new ArrayList<>(Arrays.asList(
            "Java", "Interface", "Fonctionnelle", "Stream", "Supplier"
        ));

        // Supplier string la plus longue
        Supplier<String> chainePlusLongue = () -> chaines.stream()
            .max(Comparator.comparingInt(String::length))
            .orElse("Aucune chaîne trouvée");

        System.out.println("Chaîne la plus longue : " + chainePlusLongue.get());

        // Ajout d'une nouvelle string
        chaines.add("Programmation Fonctionnelle en Java");
        System.out.println("Chaîne la plus longue après ajout : " + chainePlusLongue.get());

        // filter() et forEach() - affiche uniquement les longues strings
        System.out.println("Chaînes contenant plus de 10 caractères :");
        chaines.stream()
            .filter(s -> s.length() > 10)
            .forEach(System.out::println);
    }
}
