package src;

import java.util.ArrayList;
import java.util.List;

public class GetRollingAverage {
    public static List<Double> getRollingAverage(List<Integer> arr, int k) {
        int n = arr.size(); // Получаем размер массива

        // Проверка на допустимость значения k
        if (k <= 0 || k > n) {
            throw new IllegalArgumentException("k должно быть положительным и меньше или равно размеру массива.");
        }

        // Начальное заполнение окна
        List<Double> result = new ArrayList<>();
        double windowSum = 0.0;

        for (int i = 0; i < k; i++) {
            windowSum += arr.get(i);
        }
        result.add(windowSum / k);

        // Обновление окна и вычисление среднего
        for (int i = k; i < arr.size(); i++) {
            windowSum += arr.get(i) - arr.get(i - k);
            result.add(windowSum / k);
        }
        return result;
    }
}
