package CH01;

import java.util.*;

public class EX01_01  {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of integers : ");
        int n = input.nextInt();
        System.out.print("Enter your numbers : ");
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            
        }
        
        System.out.println("The maximum is " + max(arr));
        
    }
    
    
    
    
    public  static int max(int[] arr){
        
        int x = arr [0];
        
        for (int i = 0; i < arr.length; i++) {
            if (x < arr[i]) {
                x = arr[i];
            }
        }
        return x;
    }
    
}
