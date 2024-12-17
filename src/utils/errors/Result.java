package utils.errors;

public interface Result<T, E> {
    boolean isOk();
    boolean isErr();
}
