package src;

import java.util.ArrayList;
import java.util.List;

public class GetRollingAverage {
    public static List<Double> getRollingAverage(List<Integer> arr, int k) {
        List<Double> result = new ArrayList<>();
        double windowSum = 0.0;

        for (int i = 0; i < k; i++) {
            windowSum += arr.get(i);
        }
        result.add(windowSum / k);

        for (int i = k; i < arr.size(); i++) {
            windowSum += arr.get(i) - arr.get(i - k);
            result.add(windowSum / k);
        }

        return result;
    }
}
