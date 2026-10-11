package Week_9;

public class HotWeatherAlerts {

    public static int countAlerts(int[] readings, int k, int threshold) {
        if (readings == null || readings.length < k || k <= 0) {
            return 0;
        }

        long targetSum = (long) k * threshold;
        long currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += readings[i];
        }

        int alertCount = 0;
        if (currentSum >= targetSum) {
            alertCount++;
        }

        for (int i = k; i < readings.length; i++) {
            currentSum += readings[i] - readings[i - k];
            if (currentSum >= targetSum) {
                alertCount++;
            }
        }

        return alertCount;
    }

    public static void main(String[] args) {
        int[] readings = {2, 2, 2, 2, 5, 5, 5, 8};
        int k = 3;
        int threshold = 4;

        int result = countAlerts(readings, k, threshold);
        System.out.println(result);
    }
}
