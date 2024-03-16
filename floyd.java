package CH03;

public class floyd {
    

    public static void main(String[] args) {
       int n = (int)(Math.random() * 10);
       
        int [][] D = new int [n][n];
        D = fillArray(n , D);
        
        floyd.Floyd(n , D);
    }
    
    public static int [][] fillArray(int n , int [][] W){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                W[i][j] = (int)(Math.random() * 100);
            }
        }
        return W;
    }
   public static String Floyd(int n, int W[][] ) {
        int D[][];
        String sd ="D is \n";
        int P[][]=new int[n][n];
        int i, j, k;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                P[i][j] = 0;
            }
        }
        D = W;
        for (k = 0; k < n; k++) {
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    if (D[i][k] + D[k][j] < D[i][j]) {
                        P[i][j] = k;
                        D[i][j] = D[i][k] + D[k][j];
                    }
                }
            }
        }
        for (int z=0;z<n;z++){
            for (int y=0;y<n;y++){
                sd+=D[z][y]+" ";
            }
            sd+="\n";
        }
        sd+="P is \n";
        for (int z=0;z<n;z++){
            for (int y=0;y<n;y++){
                sd+=P[z][y]+" ";
            }
            sd+="\n";

        }
        return sd;
        
    
   }
}
