package variables;

public class IndianaJones {
    public static void main(String... args) {
        String nameMovie = "Indiana Jones and the Last Crusade";
        Boolean viewMovie  = false;
        int createdDate = 1989;
        double ratingMovie = 8.2;


        System.out.println("Titre du film : " + nameMovie);
        System.out.println("Avez-vous vu le film ? " + (viewMovie ? "Oui" : "Non"));
        System.out.println("Année de sortie : " + createdDate);
        System.out.println("Note IMDB : " + ratingMovie);
    }
}

