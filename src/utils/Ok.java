package utils;

public final class Ok<T, E> implements Result<T, E> {
    private final T value;

    private Ok(T value) {
        this.value = value;
    }

    public static <T, E> Ok<T, E> of(T value) {
        return new Ok<>(value);
    }

    public T getValue() {
        return value;
    }

    @Override
    public boolean isOk() {
        return true;
    }

    @Override
    public boolean isErr() {
        return false;
    }
}
