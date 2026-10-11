package Week_9;

import java.util.Arrays;

public class ClassTopperFInder {

    public static int[] findTopper(int[][] marks) {
        if (marks == null || marks.length == 0) {
            return new int[]{-1, 0};
        }

        int bestRowIndex = 0;
        int maxTotal = Integer.MIN_VALUE;

        for (int i = 0; i < marks.length; i++) {
            int currentTotal = 0;
            for (int j = 0; j < marks[i].length; j++) {
                currentTotal += marks[i][j];
            }

            if (currentTotal > maxTotal) {
                maxTotal = currentTotal;
                bestRowIndex = i;
            }
        }

        return new int[]{bestRowIndex, maxTotal};
    }

    public static void main(String[] args) {
        int[][] marks = {
            {78, 85, 90},
            {88, 92, 79},
            {65, 70, 95}
        };

        int[] result = findTopper(marks);
        System.out.println(Arrays.toString(result));
    }
}
