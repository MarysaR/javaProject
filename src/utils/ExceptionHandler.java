package utils;

import java.util.function.Supplier;

public class ExceptionHandler {
    // Méthode générique pour exécuter une logique avec gestion centralisée des exceptions
    public static <T> T execute(Supplier<T> task, String errorMessage) {
        try {
            return task.get();
        } catch (Exception e) {
            return null;
        }
    }
}
