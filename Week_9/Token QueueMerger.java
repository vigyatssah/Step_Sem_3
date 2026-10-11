package Week_9;

import java.util.Arrays;

class TokenQueueMerger {

    public static int[] mergeTokens(int[] counterA, int[] counterB) {
        if (counterA == null) counterA = new int[0];
        if (counterB == null) counterB = new int[0];

        int n1 = counterA.length;
        int n2 = counterB.length;
        int[] merged = new int[n1 + n2];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1 && j < n2) {
            if (counterA[i] <= counterB[j]) {
                merged[k++] = counterA[i++];
            } else {
                merged[k++] = counterB[j++];
            }
        }

        while (i < n1) {
            merged[k++] = counterA[i++];
        }

        while (j < n2) {
            merged[k++] = counterB[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] counterA = {3, 8, 15, 20};
        int[] counterB = {5, 8, 12};

        int[] result = mergeTokens(counterA, counterB);
        System.out.println(Arrays.toString(result));
    }
}
