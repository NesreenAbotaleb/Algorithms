package CH01;

public class EX01_05_code {
    public static void main(String[] args) {
        System.out.println(GCD(15 , 20));
    }
    
    public static int GCD(int a , int b){
        if(a < b){
            int temp = a ;
            a = b ;
            b = temp;
        }
        int c = a % b ;
        if (c == 0)return b;
        else {
            a = b;
            b = c;
            
            return GCD(a , b);
        }
    }
}
