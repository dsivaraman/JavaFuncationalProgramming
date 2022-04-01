package com.stream;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'minCost' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY cost as parameter.
     */

    public static int minCost(List<List<Integer>> cost) {


        int[][] costArray =  cost.toArray(new int[cost.size()][]);

        int price;

        IntStream.range(1, costArray.length).forEach(i -> {
            costArray[i][0] += Math.min(costArray[i - 1][1], costArray[i - 1][2]);
            costArray[i][1] += Math.min(costArray[i - 1][0], costArray[i - 1][2]);
            costArray[i][2] += Math.min(costArray[i - 1][1], costArray[i - 1][0]);
        });

        price = Math.min(
                Math.min(costArray[costArray.length -1][0],
                        costArray[costArray.length -1][1]),
                costArray[costArray.length -1][2]);

        return price;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int costRows = Integer.parseInt(bufferedReader.readLine().trim());
        int costColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> cost = new ArrayList<>();

        IntStream.range(0, costRows).forEach(i -> {
            try {
                cost.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.minCost(cost);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
