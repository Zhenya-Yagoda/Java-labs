public class main {
    public static void main(String args[]) {
        matrix mas= new matrix();
        unitMatrix unitmas=new unitMatrix();
        transposedMatrix transmas=new transposedMatrix();

        String  mas1[][] ={
            {"1", "2", "3"},
            {"4", "5", "6"},
            {"7", "8", "9"}
            };

//        String  mas2[][]=mas.ramdommat();
//        mas.printmas(mas2);

//        String [][] mas3 =mas.putvalue();
//        mas.printmas(mas3);

//        mas.printmas(mas.emptym());
//        mas.printmas(mas.putvalue());
//        mas.printmas(mas.copymas(mas1));
//        mas.getvalue(mas1);
//        mas.getS(mas1);
//        mas.getR(mas1);
        System.out.println("Розмірність матриці - "+mas.getrozm(mas1)[0]+" * "+mas.getrozm(mas1)[1]);

//        mas.printmas(unitmas.odmat(mas.getnum("Введіть кількість рядків одиничної матриці - ")));

//        mas.printmas(transmas.transmat(mas1));
//        mas.printmas(transmas.transmat(mas2));
//        mas.printmas(transmas.transmat(mas3));
        

    }
}

