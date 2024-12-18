package projet90;

import java.util.*;
import java.util.stream.Collectors;

public class Projet90 {
    public static void main(String[] args) {
        // Liste de strings
        List<String> chaines = Arrays.asList(
            "Java", "Stream", "Lambda", "API", "Concaténation", "Exemple", "Caractère"
        );

        // Concaténe toutes les strings pour en former qu'une seule
        String chaineConcatenee = chaines.stream()
            .collect(Collectors.joining()); // Concaténation
        System.out.println("String concaténée : " + chaineConcatenee);

        // Vérifie si la string résultante contient un caractère spécifique
        char caractereRecherche = 'a'; 
        boolean contientCaractere = chaineConcatenee.indexOf(caractereRecherche) != -1;
        System.out.println("La string concaténée contient '" + caractereRecherche + "' : " + contientCaractere);

        // Crée une nouvelle liste contenant les strings originales qui contiennent le caractère spécifique
        List<String> chainesAvecCaractere = chaines.stream()
            .filter(s -> s.indexOf(caractereRecherche) != -1) // Filtre les strings contenant le caractère
            .collect(Collectors.toList());
        System.out.println("Strings contenant le caractère '" + caractereRecherche + "' : " + chainesAvecCaractere);
    }
}
