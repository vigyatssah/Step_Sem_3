package Week_9;

import java.util.HashMap;
import java.util.Map;

public class CanteenOrderAnalyzer {

    public static Object[] mostPopular(String[] orders) {
        if (orders == null || orders.length == 0) {
            return new Object[]{"", 0};
        }

        Map<String, Integer> counts = new HashMap<>();
        for (String order : orders) {
            counts.put(order, counts.getOrDefault(order, 0) + 1);
        }

        String popularItem = "";
        int maxCount = 0;

        for (String order : orders) {
            int count = counts.get(order);
            if (count > maxCount) {
                maxCount = count;
                popularItem = order;
            }
        }

        return new Object[]{popularItem, maxCount};
    }

    public static void main(String[] args) {
        String[] orders = {"dosa", "idli", "vada", "dosa", "idli", "dosa", "tea"};
        Object[] result = mostPopular(orders);
        System.out.println("(" + result[0] + ", " + result[1] + ")");
    }
}
