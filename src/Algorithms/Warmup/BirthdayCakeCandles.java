package Algorithms.Warmup;

import java.util.Arrays;
import java.util.List;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        List<Integer> candles = Arrays.asList(3, 2, 1, 3);
        System.out.println(birthdayCakeCandles(candles));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        int maxCandleHeight = Integer.MIN_VALUE;
        int maxCandleFreqCount = 0;
        Arrays.sort(candles.toArray());
        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) == maxCandleHeight) {
                maxCandleFreqCount++;
            }

            if (candles.get(i) > maxCandleHeight) {
                maxCandleHeight = candles.get(i);
                maxCandleFreqCount = 1;
            }

        }
        return maxCandleFreqCount;
    }
}
