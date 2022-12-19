public class transposedMatrix {
    public static String[][] transmat(String[][] mas1){
        String [][] mas=new String[mas1[0].length][mas1.length];
        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas1[0].length; j++) {
                mas[j][i]=mas1[i][j];
            }
        }
        return mas;
    }

}
