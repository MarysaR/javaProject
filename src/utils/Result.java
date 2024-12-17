package utils;

public interface Result<T, E> {
    boolean isOk();
    boolean isErr();
}
