package utils;

// Exception personnalisée pour les erreurs de tarif horaire
public class TarifException extends Exception {
    public TarifException(String message) {
        super(message);
    }
}
