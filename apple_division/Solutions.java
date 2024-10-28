// package intro.apple_division;

import java.util.*;

public class Solutions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        long min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (n == 1)
            System.out.println(arr[0]);
        else {
            Arrays.sort(arr);
            long sum1 = arr[n - 1];
            long sum2 = arr[n - 2];
            int i = n - 3;
            if (i > -1) {
                min = Math.min(min, sum1 - sum2);
                System.out.println(sum1 + " " + sum2);
                if (sum1 > sum2) {
                    sum2 += arr[i];
                } else {
                    sum1 += arr[i];
                }
                i--;
            }
            min = Math.min(min, sum1 - sum2);
            System.out.println(min);
        }

    }
}
