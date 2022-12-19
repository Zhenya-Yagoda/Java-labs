import java.util.Scanner;

public class matrix {
    public static String[][] emptym(){
        String [][] mas;
        int n=getnum("Введіть кількість рядків в матриці - ");
        int m=getnum("Введіть кількість стовпців в матриці - ");
        mas=new String[n][m];
        return  mas;
    }
    public static int getnum(String args){ //введення кількості рядків і стовпців
        String s1;
        Scanner scanner = new Scanner(System.in);
        System.out.println(args);
        s1 = scanner.nextLine();
        int n=Integer.parseInt(s1);
        return n;
    }
    public static String[][] putvalue() { //заповнення значень в масив
        String [][] mas;
        int n=getnum("Введіть кількість рядків в матриці - ");
        int m=getnum("Введіть кількість стовпців в матриці - ");
        mas=new String[n][m];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("mas[" + i + "][" + j + "] = ");
                mas[i][j] = scanner.nextLine();
            }
        }
        return mas;
    }
    public static String[][] copymas(String [][] mas){   ///copy mas
        String [][] mascopy ; //copy mas
        mascopy=new String[mas.length][mas[0].length];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                mascopy[i][j] =mas[i][j];
            }
        }
        return mascopy;
    }

    public static void printmas(String[][] mas) { //print array
        System.out.println("-------------------");
        System.out.println("Матриця : ");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------");

    }

    public static void getvalue(String[][] mas){ //виведення заданого елемента
        int n=getnum("Введіть номер рядка елемента - ");
        int m=getnum("Введіть номер стовпця елемента - ");
        int ok=0;
        if (n<=mas.length){
            if (m<=mas[0].length){
                System.out.println("Шуканий елемент - "+ mas[n-1][m-1]);
            }
            else {
                if (ok==0){
                    System.out.println("Введено неправильний індекс");
                }
            }
        }
        else {
            ok=1;
            System.out.println("Введено неправильний індекс");
        }
    }

    public static void getR(String[][] mas){ //виведення по рядку
        int n=getnum("Введіть номер рядка - ");
        if (n<=mas.length){
            System.out.println("Шуканий рядок - "); //стовпчик
            for (int i = 0; i < mas[n-1].length; i++) {
                System.out.print(mas[n-1][i]+" ");
            }
        }
        else {
            System.out.println("Введено неправильний індекс");
        }
    }

    public static void getS(String[][] mas){ // виведення по стовпчику
        int m=getnum("Введіть номер стовпця - ");
        if (m<=mas[0].length){
            System.out.println("Шуканий стовпчик - ");
            for (int i = 0; i < mas.length; i++) {
                System.out.println(mas[i][m-1]+" ");
            }
        }
        else {
            System.out.println("Введено неправильний індекс");

        }
    }
    public static int[] getrozm(String[][] mas){ //розмірність
        int [] mas1;
        mas1=new int [2];
        mas1[0]=mas.length;
        mas1[1]=mas[0].length;
        return mas1;
    }

    public static String ranvalue(){ //випадкові значення
        int a = (int) (Math.random()*(200+1)) - 100;
        String k=Integer.toString(a);
        return k;
    }

    public static String[][] ramdommat(){
        int n=getnum("Введіть кількість рядків в матриці - ");
        int m=getnum("Введіть кількість стовпців в матриці - ");
        String[][] mas= new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mas[i][j] = ranvalue();
            }
        }
        return mas;
    }
}
