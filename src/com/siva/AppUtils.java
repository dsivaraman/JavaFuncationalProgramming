package com.siva;

import java.util.function.Function;

public interface AppUtils {
    Function<String, Profile> fieldDuplicateError = msg -> new Profile("siva", "raman", msg);
}
