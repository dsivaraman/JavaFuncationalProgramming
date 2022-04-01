package com.siva;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class MapWithPipe {

    public static void main(String[] args) {
        MapWithPipe mapWithPipe = new MapWithPipe();
        mapWithPipe.show();

    }

    public void show() {
        Map<String, List<ErrorObj>> map = new HashMap<>();

        ArrayList<ErrorObj> list = new ArrayList<>();
        list.add(new ErrorObj("101", "error 101"));
        list.add(new ErrorObj("102", "error 102"));

        map.put("one", list);
        AtomicReference<String> collect = new AtomicReference<>();
        map.forEach((x,y) -> collect.set(y.stream().map(m -> m.errorCode)
                .collect(Collectors.joining(" | "))));

        String collect1 = list.stream().map(x -> x.getErrorCode())
                .collect(Collectors.joining(" | "));

        System.out.println("collect = " + collect1);
    }
}

class ErrorObj {
    String errorCode;
    String errorMessage;

    public ErrorObj(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
