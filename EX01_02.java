package CH01;

import java.util.Scanner;

public class EX01_02 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of integers : ");
        int n = input.nextInt();
        
        System.out.print("Enter the number of smallest numbers : ");
        int m = input.nextInt();

        System.out.print("Enter your numbers : ");
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            
        }
        
        System.out.println("The maximum is :");
        arr = min(arr , m);
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
    
    
    
    
    public  static int[] min(int[] arr , int m){
        int [] min = new int[m];
        int x = arr [0];
        //int temp;
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (x > arr[i]) 
                    x = arr[i];
                
            }
            min[j] = x;
        }
        
        return min;
    }
}
