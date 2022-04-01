package com.siva;

@FunctionalInterface
public interface SecurityResourceException<T> {
    void acceptException(T t) throws RuntimeException;

    static void showErrorMessage(String msg) {
        SecurityResourceException<String> exception = s -> {
            throw new RuntimeException(s);
        };
        exception.acceptException("data validation error - " + msg);
    }

    static void showErrorMessage(String desc, String msg) {
        SecurityResourceException<String> exception = s -> {
            new RuntimeException(s);
        };
        exception.acceptException(desc + msg);
    }
}
