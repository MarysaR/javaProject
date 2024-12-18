package collections;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        // 1. Utilisation de List (exemple : ArrayList)
        List<String> list = new ArrayList<>();
        list.add("Pomme");
        list.add("Banane");
        list.add("Pomme"); // Autorise les doublons
        System.out.println("Liste : " + list);

        // 2. Utilisation de Set (exemple : HashSet)
        Set<String> set = new HashSet<>();
        set.add("Pomme");
        set.add("Banane");
        set.add("Pomme"); // Ignoré car Set n'autorise pas les doublons
        System.out.println("Set : " + set);

        // 3. Utilisation de SortedSet (exemple : TreeSet)
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Banane");
        sortedSet.add("Pomme");
        sortedSet.add("Ananas");
        System.out.println("SortedSet : " + sortedSet); // Maintient l'ordre naturel

        // 4. Utilisation de Map (exemple : HashMap)
        Map<String, Integer> map = new HashMap<>();
        map.put("Pomme", 3);
        map.put("Banane", 5);
        map.put("Pomme", 7); // Remplace l'entrée existante
        System.out.println("Map : " + map);

        // 5. Utilisation de SortedMap (exemple : TreeMap)
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("Banane", 5);
        sortedMap.put("Pomme", 7);
        sortedMap.put("Ananas", 10);
        System.out.println("SortedMap : " + sortedMap); // Maintient l'ordre naturel des clés

        // 6. Parcours avec Iterator
        System.out.println("Parcours avec Iterator (List) :");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("- " + iterator.next());
        }

        // 7. Manipulation avancée : Boucles modernes
        System.out.println("Parcours avec boucle for-each (Set) :");
        for (String fruit : set) {
            System.out.println("- " + fruit);
        }

        // Utilisation d'ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Pomme");
        fruits.add("Banane");
        fruits.add("Cerise");
        System.out.println("Premier fruit : " + fruits.get(0));
        System.out.println("Taille de la liste : " + fruits.size());
        System.out.println("La liste contient 'Banane' ? " + fruits.contains("Banane"));
        fruits.remove("Pomme");
        System.out.println("Liste après suppression : " + fruits);

        ArrayList<String> autresFruits = new ArrayList<>();
        autresFruits.add("Ananas");
        autresFruits.add("Mangue");
        fruits.addAll(autresFruits);
        System.out.println("Liste après ajout : " + fruits);

        // Utilisation de LinkedList
        LinkedList<String> animaux = new LinkedList<>();
        animaux.add("Chat");
        animaux.add("Chien");
        animaux.add("Lapin");
        System.out.println("Premier animal : " + animaux.get(0));
        animaux.addFirst("Oiseau");
        animaux.addLast("Tortue");
        System.out.println("Liste après ajout en tête et en queue : " + animaux);
        animaux.pollFirst();
        animaux.pollLast();
        System.out.println("Liste après suppression en tête et en queue : " + animaux);
        System.out.println("Premier élément : " + animaux.peekFirst());
        System.out.println("Dernier élément : " + animaux.peekLast());
    }
}
