package Warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    private static List<List<Integer>> arr = Arrays.asList(Arrays.asList(3, 11, 2, 4, 4, 5, 6, 10, 8, -12));

    public static void main(String[] args) {
        Integer value = diagonalDifference(arr);
        System.out.println(value);
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int primaryDiagnal = 0;
        int secDiagnal = 0;
        int diff;

        for (int i = 0; i < arr.get(0).size(); i++) {
            primaryDiagnal += arr.get(i).get(i);
        }

        int col = arr.get(0).size() - 1;
        for (int i = 0; i < arr.get(0).size(); i++) {
            secDiagnal += arr.get(i).get(col);
            col--;
        }

        diff = primaryDiagnal - secDiagnal;
        return Math.abs(diff);
    }

}
