package CH01;

import java.util.*;

public class EX01_03 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of integers : ");
        int n = input.nextInt();
        System.out.print("Enter your numbers : ");
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            
        }
    }
    
    public static void subsets(int [] arr){
        int count = 0;
        int [] sub = new int[3];
        int num_subset = 0;
        if (arr.length % 3 != 0) {
            for (int i = 0; i < arr.length - 2; i++) {
                sub[count] = arr[i];

                if (count == 2) {
                    System.out.print("Subset " + num_subset + " : ");
                    for (int j = 0; j < 3; j++) {
                        System.out.print(sub[j] + " ");
                    }
                    num_subset++;
                    System.out.println("");
                    count = -1;
                }
                count++;
            }
            System.out.println("Subset " + num_subset + " : " ); 
        }
        for (int i = 0; i < arr.length ; i++) {
            sub[count] = arr[i];
            
            if (count == 2) {
                System.out.print("Subset " + num_subset );
                for (int j = 0; j < 3; j++) {
                    System.out.print(sub[j] + " ");
                }
                num_subset++;
                System.out.println("");
                count = -1;
            }
            count++;
        }
    }
}
