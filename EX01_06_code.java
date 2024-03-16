/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CH01;

/**
 *
 * @author nessr
 */
public class EX01_06_code {
//     public  static int max(int[] arr){
//        
//        int x = arr [0];
//        
//        for (int i = 0; i < arr.length; i++) {
//            if (x < arr[i]) {
//                x = arr[i];
//            }
//        }
//        return x;
//    }
    public static int max(int[] arr){
        int m_l = 0;
        if (arr.length % 2 == 0) {
            m_l = arr.length / 2; 
        }
        else{
             m_l = arr.length / 2 + 1;
        }
        int[] m = new int [m_l];
        for (int i = 0 , j = 0; i < arr.length - 1&& j < m.length ; i += 2 , j++) {
            if (arr[i] > arr[i+1]) {
                m[j] = arr[i];
            }
            else m[j] = arr [i];
            
        }
        int max = m[0];
            for (int j = 0; j < m.length; j++) {
                if(max < m[j])max  = m[j];
            }
           return max; 
    }
     public  static int min(int[] arr){
       
        int x = arr [0];
        //int temp;
        
            for (int i = 0; i < arr.length; i++) {
                if (x > arr[i]) 
                    x = arr[i];
                
            }
        
        return x;   
//   int m_l = 0;
//        if (arr.length % 2 == 0) {
//            m_l = arr.length / 2; 
//        }
//        else{
//             m_l = arr.length / 2 + 1;
//        }
//        int[] m = new int [m_l];
//            for (int i = 0 , j = 0; i < arr.length - 1&& j < m.length ; i += 2 , j++) {
//            if (arr[i] < arr[i+1]) {
//                m[j] = arr[i];
//            }
//            else m[j] = arr [i];
//            
//        }
//        int min = m[0];
//            for (int j = 0; j < m.length; j++) {
//                if(min > m[j]) 
//                    min = m[j];
//            }
//           return min; 
    }
}
