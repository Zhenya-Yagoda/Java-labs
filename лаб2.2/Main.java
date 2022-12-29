public class Main {
    public static void main(String args[]) {
        String  mas[][] ={
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };
//        Matrix emptymas= new Matrix();

//        Matrix copymymas= new Matrix(mas);
//        Matrix.printmas(copymymas.copymas(mas));

        Matrix vmas= new Matrix("Введіть кількість рядків в матриці - ","Введіть кількість стовпців в матриці - ");
        String  mas1[][]=vmas.putvalue();
        Matrix.printmas(mas1);

//        Matrix randommas= new Matrix("Введіть кількість рядків в матриці - ","Введіть кількість стовпців в матриці - ");
//        String  mas2[][]=randommas.ramdommat();
//        Matrix.printmas(mas2);

//        Matrix.getvalue(mas1);
//        Matrix.getR(mas1);
//        Matrix.getS(mas1);
//        System.out.println("Розмірність матриці - "+Matrix.getrozm(mas1)[0]+" * "+Matrix.getrozm(mas1)[1]);
//
//        Matrix.printmas(transposedMatrix.transmat(mas1));

//        Matrix.getvalue(mas2);
//        Matrix.getR(mas2);
//        Matrix.getS(mas2);
//        System.out.println("Розмірність матриці - "+Matrix.getrozm(mas2)[0]+" * "+Matrix.getrozm(mas2)[1]);
//
//        Matrix.printmas(transposedMatrix.transmat(mas2));

//        unitMatrix unitmas= new unitMatrix();


    }
}
