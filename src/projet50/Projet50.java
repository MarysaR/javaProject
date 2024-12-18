package projet50;

import utils.exceptions.ExceptionHandler;
import utils.errors.Err;
import utils.errors.Result;


import java.util.*;
import java.util.stream.*;

public class Projet50 {
    public static void main(String[] args) {
        // Liste d'entiers vide - teste la gestion des erreurs
        List<Integer> nombres = Arrays.asList();
        // List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5);


        // Gestion de la liste via ExceptionHandler et Result
        Result<String, String> resultat = ExceptionHandler.execute(() -> analyserListe(nombres), "Erreur lors de l'analyse de la liste");
        if (resultat.isErr()) {
            Err<String, String> erreur = (Err<String, String>) resultat;
            System.out.println("Erreur : " + erreur.getError());
        }
    }

    // Méthode pour analyser une liste d'entiers
    private static String analyserListe(List<Integer> nombres) {
        if (nombres.isEmpty()) {
            throw new IllegalArgumentException("La liste est vide !");
        }

        // Calculs principaux
        int somme = nombres.stream().mapToInt(Integer::intValue).sum();
        int min = nombres.stream().mapToInt(Integer::intValue).min().orElseThrow();
        int max = nombres.stream().mapToInt(Integer::intValue).max().orElseThrow();
        double moyenne = nombres.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        long total = nombres.stream().count();

        System.out.println("Somme : " + somme);
        System.out.println("Minimum : " + min);
        System.out.println("Maximum : " + max);
        System.out.println("Moyenne : " + moyenne);
        System.out.println("Total : " + total);

        // Séparation des nombres pairs et impairs
        List<Integer> pairs = nombres.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        List<Integer> impairs = nombres.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());

        System.out.println("Nombres pairs : " + pairs);
        System.out.println("Nombres impairs : " + impairs);

        return "Analyse terminée avec succès.";
    }
}
