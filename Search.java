package CH01;

import java.util.Arrays;

public class Search {
    
    public static void main(String[] args) {
        int [] nums = new int [10];
        int x;
        for (int i = 0; i < 10; i++) {
            nums[i] = (int)(Math.random() * 100);
           
        }
        Arrays.sort(nums);
       
        
         
         
    }
    
    public static String BinarySearch(int a[], int x) {
        
        int l = 0;
        int r = a.length - 1;
        while (l <= r) {
            int m = l + ((r - l) / 2);
            if (a[m] == x) {
                return x+" is at the index "+m;
            }
            if (a[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ""+ -1;
    }
    
    public static int LinearSearch(int [] nums , int x){
       
        for (int i = 0; i < nums.length; i++) {
            if(x == nums[i]){
                return i;
            }
        }
        return -1;
    } 
    
   
}
