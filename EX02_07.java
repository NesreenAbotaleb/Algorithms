package CH02;

import java.util.*;

public class EX02_07 {
    static int n;
    static int s[];

    public EX02_07(int n) {
        this.n = n;
        s = new int[n];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        EX02_07 obj = new EX02_07(n);

        for (int i = 0; i < n; i++) {
            s[i] = (int) (Math.random() * 10 + 1);
            System.out.print(s[i] + " ");
        }
        System.out.println("\n" + largest(0, n - 1));
    }

    public static int largest(int low, int high) {
        if (low == high) {
            return s[low];
        } else {
            int mid = Math.floorDiv(low + high, 2);
            int left = largest(low, mid);
            int right = largest(mid + 1, high);

            if (left > right) {
                return left;
            } else {
                return right;
            }
        }
    }
    

}
