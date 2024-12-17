package utils.exceptions;

import java.util.function.Supplier;
import utils.errors.Err;
import utils.errors.Ok;
import utils.errors.Result;

public class ExceptionHandler {
    // Méthode générique avec Result pour centraliser les exceptions
    public static <T> Result<T, String> execute(Supplier<T> task, String errorMessage) {
        try {
            return Ok.of(task.get());
        } catch (Exception e) {
            return Err.of(errorMessage + " : " + e.getMessage());
        }
    }
}
