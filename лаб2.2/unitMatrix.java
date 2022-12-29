public class unitMatrix {
    public  unitMatrix(){
        int n=Matrix.getnum("Введіть кількість рядків одиничної матриці - ");
        Matrix.printmas(odmat(n));
    }
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










//    int nod;
//    public unitMatrix(String arg1){
//        nod=Matrix.getnum(arg1);
//    }
//    public String[][] odmat( ){ // одинична матриця
//        String [][] mas = new String[this.nod][this.nod];
//        for (int i = 0; i < this.nod; i++) {
//            for (int j = 0; j < this.nod; j++) {
//                if (i!=j){
//                    mas[i][j] ="0";
//                }
//                else {
//                    mas[i][j] ="1";
//                }
//            }
//        }
//        return mas;
//    }