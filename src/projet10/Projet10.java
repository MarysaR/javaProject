package projet10;

import java.util.Scanner;

public class Projet10 {
    public static void main(String... args) {
        // Création d'un objet Scanner pour lire les entrées utilisateur
        Scanner scanner = new Scanner(System.in);

        // Lecture des deux entiers
        System.out.print("Entrez le premier entier : ");
        int entier1 = scanner.nextInt();

        System.out.print("Entrez le deuxième entier : ");
        int entier2 = scanner.nextInt();

        // Réalisation des opérations
        System.out.println("Addition : " + (entier1 + entier2));
        System.out.println("Soustraction : " + (entier1 - entier2));
        System.out.println("Multiplication : " + (entier1 * entier2));

        // Gestion de la division
        if (entier2 != 0) {
            System.out.println("Division : " + (entier1 / entier2));
        } else {
            System.out.println("Division : impossible (division par zéro)");
        }

        // Fermeture du Scanner
        scanner.close();
    }
}