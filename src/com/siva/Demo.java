package com.siva;

import java.io.Console;
import java.util.Arrays;

public class Demo {

    public int dis = 9;
    public double weigth = 10;

    public void setDis(int num) {
       String string[] = new String[] {
                "988",       // <- this is a prefix of "98816740"
                "43722451",
                "98816740",  // <- has a prefix "988" which is within the collection
                "123",
                "456",
        };

        Arrays.sort(string);

        for (int i = 1; i < string.length; ++i)
            if (string[i].startsWith(string[i - 1])) {
                //TODO: Conflict found, put relevant code here
//                System.out.println("{0} is a prefix of {1}", string[i - 1], string[i]);
            }
    }
}
