// package intro.two_sets;

import java.util.*;

public class Solutions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long total = (n * (n + 1)) / 2;
        if (total % 2 != 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            StringBuilder aBuilder = new StringBuilder();
            StringBuilder bBuilder = new StringBuilder();

            int aCount = 0, bCount = 0;

            long sum = total / 2;
            // Start from the largest number and try to fill set 'a'
            for (long i = n; i > 0; i--) {
                if (sum >= i) {
                    aBuilder.append(i).append(" ");
                    sum -= i;
                    aCount++;
                } else {
                    bBuilder.append(i).append(" ");
                    bCount++;
                }
            }

            // Output the sizes and contents of both sets
            System.out.println(aCount);
            System.out.println(aBuilder.toString().trim());

            System.out.println(bCount);
            System.out.println(bBuilder.toString().trim());
        }
    }
}
