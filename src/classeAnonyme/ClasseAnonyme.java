package classeAnonyme;


@FunctionalInterface
interface Operation {
    double calcul(double a, double b);
}

public class ClasseAnonyme {
    public static void main(String[] args) {
        Operation addition = new Operation() {
            @Override // s'assure que la méthode redéfinie correspond exactement à une méthode existante
            public double calcul(double a, double b) {
                return a + b;
            }
        };

        // Utilisation de la classe anonyme
        System.out.println("Addition avec classe anonyme : " + addition.calcul(5, 3));

        // Réécriture avec une expression Lambda
        Operation multiplication = (a, b) -> a * b;

        // Utilisation de l'expression Lambda
        System.out.println("Multiplication avec Lambda : " + multiplication.calcul(5, 3));
    }
}
