package CH01;

public class EX04 {
    public static void main(String[] args) {
        int [] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 1 + (int)(Math.random()*10);
            System.out.print(a[i] + " ");
        }
        
        int p = max_position(0 , a.length - 1 , a);
        System.out.println(p);
    }

    public static int max_position(int low , int high , int [] S){
        
        int position = -1;
        if(low == high)
            return low;
        else if(low < high){
            position = max_position(low + 1 ,high , S);
            if(S[low] > S[position])
                position = low;
            return position;
        }
        return position;
    }
}
