package projet100;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Projet100 {
    static class Produit {
        private String nom;
        private double prix;
        private int stock;

        public Produit(String nom, double prix, int stock) {
            this.nom = nom;
            this.prix = prix;
            this.stock = stock;
        }

        public String getNom() {
            return nom;
        }

        public double getPrix() {
            return prix;
        }

        public int getStock() {
            return stock;
        }

        public void setPrix(double prix) {
            this.prix = prix;
        }

        @Override
        public String toString() {
            return String.format("Produit[nom=%s, prix=%.2f, stock=%d]", nom, prix, stock);
        }
    }

    public static void main(String[] args) {
        List<Produit> produits = Arrays.asList(
            new Produit("Produit A", 50.0, 10),
            new Produit("Produit B", 100.0, 0),
            new Produit("Produit C", 25.0, 5),
            new Produit("Produit D", 75.0, 0)
        );

        // Consumer : Affiche les informations de chaque produit
        Consumer<Produit> afficherProduit = produit -> System.out.println(produit);

        System.out.println("Liste des produits disponibles :");
        produits.forEach(afficherProduit);

        // Supplier : Génère un produit
        Supplier<Produit> produitParDefaut = () -> new Produit("Produit Inconnu", 0.0, 0);
        System.out.println("\nProduit par défaut : " + produitParDefaut.get());

        // Predicate : Vérifie si un produit est en rupture de stock
        Predicate<Produit> estEnRuptureDeStock = produit -> produit.getStock() == 0;

        System.out.println("\nProduits en rupture de stock :");
        produits.stream()
                .filter(estEnRuptureDeStock)
                .forEach(afficherProduit);

        // Function : Applique une réduction de 10 % sur le prix de chaque produit
        Function<Produit, Produit> appliquerReduction = produit -> {
            produit.setPrix(produit.getPrix() * 0.9);
            return produit;
        };

        List<Produit> produitsAvecReduction = produits.stream()
                .map(appliquerReduction)
                .collect(Collectors.toList());

        System.out.println("\nListe des produits après réduction de 10 % :");
        produitsAvecReduction.forEach(afficherProduit);
    }
}
