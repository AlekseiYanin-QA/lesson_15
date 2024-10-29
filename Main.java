import java.util.List;

import static src.GetRollingAverage.getRollingAverage;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 2, 3, 5);
        int k = 2;
        List<Double> res = getRollingAverage(arr, k);
        System.out.println(res);
    }
}
