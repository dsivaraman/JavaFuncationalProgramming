package com.chargebee;

import java.util.ArrayList;

public interface StatusCode {

    static boolean isSuccessCode(Integer code) {

        ArrayList<Integer> success = new ArrayList<>();
        success.add(200);
        success.add(201);
        return success.contains(code);
    }

    static boolean isFailureCode(Integer code) {

        ArrayList<Integer> failure = new ArrayList<>();
        failure.add(400);
        failure.add(404);
        return failure.contains(code);
    }
}
