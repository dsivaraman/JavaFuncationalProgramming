package com.siva;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;

public interface Utils {

    Predicate<List<?>> notNull = module -> Objects.nonNull(module) && !module.isEmpty();

    Map<String, String> securityObjectFMTType = new HashMap<String, String>() {{
        put("Base64 ASCII", "Base64");
        put("PEM", "PKCS8-PEM");
    }};
}
