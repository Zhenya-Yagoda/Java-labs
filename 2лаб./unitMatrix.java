public class unitMatrix {
    public static String[][] odmat(int n ){ // одинична матриця
        String [][] mas = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i!=j){
                    mas[i][j] ="0";
                }
                else {
                    mas[i][j] ="1";
                }
            }
        }
        return mas;
    }
}
