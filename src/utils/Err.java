package utils;

public final class Err<T, E> implements Result<T, E> {
    private final E error;

    private Err(E error) {
        this.error = error;
    }

    public static <T, E> Err<T, E> of(E error) {
        return new Err<>(error);
    }

    public E getError() {
        return error;
    }

    @Override
    public boolean isOk() {
        return false;
    }

    @Override
    public boolean isErr() {
        return true;
    }
}
