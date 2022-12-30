import java.util.Scanner;
public class Matrix {
    private int n;
    private int m;
    String [][] mas;
    String [][] copymas;
    Matrix(int n,int m){  //конструктор заданої пустої матриці
        this.n=n;
        this.m=m;
        mas=new String[this.n][this.m];
    }


    Matrix ( String args , int n , int m){  //копіювання матриць
        this.n=n;
        this.m=m;
        copymas=new String[this.n][this.m];
    }

    public static Matrix copy(Matrix mymas) {
        Matrix my = new Matrix(mymas.mas.length,mymas.mas[0].length);
        my=mymas;
        return my;
    }

    public static String ranvalue(){ //випадкові значення
        int a = (int) (Math.random()*(200+1)) - 100;
        String k=Integer.toString(a);
        return k;
    }
    public static Matrix ramdommat(int n,int m){ //матриця випадкових чисел
        Matrix my = new Matrix(n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                my.mas[i][j] = ranvalue();
            }
        }
        return my;
    }
    public static int getnum(String args){ //введення кількості рядків і стовпців
        String s1;
        Scanner scanner = new Scanner(System.in);
        System.out.println(args);
        s1 = scanner.nextLine();
        int n=Integer.parseInt(s1);
        return n;
    }
    public void printmas() { //друк матриці
        System.out.println("-------------------");
        System.out.println("Матриця : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mas[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------");
    }
    public static Matrix putvalue(int n, int m) { //заповнення значень в матрицю
        Matrix my = new Matrix(n, m);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("mas[" + i + "][" + j + "] = ");
                my.mas[i][j] = scanner.nextLine();
            }
        }
        return my;
    }
    public static Matrix changevalue(Matrix mymas , int n, int m) { //зміна значень
        Matrix my = new Matrix(mymas.mas.length, mymas.mas[0].length);
        my.mas= mymas.mas;
        Scanner scanner = new Scanner(System.in);
        my.mas[n-1][m-1] = scanner.nextLine();
        return my;
    }
    public static Matrix changeValueS(Matrix mymas , int k) { //зміна декількох значень
        Matrix my = new Matrix(mymas.mas.length, mymas.mas[0].length);
        my.mas= mymas.mas;
        Scanner scanner = new Scanner(System.in);
        for (int i=0 ; i<k ; i++){
            int n=getnum("Введіть номер рядка елемента - ");
            int m=getnum("Введіть номер стовпця елемента - ");
            System.out.println("mas[" + n + "][" + m + "] = ");
            my.mas[n-1][m-1] = scanner.nextLine();
        }
        return my;
    }
    public String getvalue(int n,int m){ //виведення заданого елемента
        String answer="";
        int ok=0;
        if (n<=mas.length){
            if (m<=mas[0].length){
                answer="Шуканий елемент - "+ mas[n-1][m-1];
            }
            else {
                if (ok==0){
                    answer="Введено неправильний індекс";
                }
            }
        }
        else {
            ok=1;
            answer="Введено неправильний індекс";
        }
        return answer;
    }
    public String getR(int n){ //виведення по рядку
        String answer="";
        if (n<=mas.length){
            answer+="Шуканий рядок - ";
            for (int i = 0; i < mas[n-1].length; i++) {
                answer+=mas[n-1][i]+" ";
            }
            answer+=" ";
        }
        else {
            answer="Введено неправильний індекс";
        }
        return answer;
    }
    public String getS(int m){ // виведення по стовпчику
        String answer="";
        if (m<=mas[0].length){
            answer+="Шуканий стовпчик - ";
            for (int i = 0; i < mas.length; i++) {
                answer+=mas[i][m-1]+" ";
            }
        }
        else {
            answer+="Введено неправильний індекс";
        }
        return answer;
    }

    public int[] getrozm(){ //розмірність
        int [] answer;
        answer=new int [2];
        answer[0]=mas.length;
        answer[1]=mas[0].length;
        return answer;
    }

    public boolean equals(Matrix mas1) { //визначення методу equals для матриць
        Matrix mas2 = this;
        int answer = 0;
        int ok=mas1.mas.length*mas1.mas[0].length;
        if ((mas1.mas.length==mas2.mas.length)&&(mas1.mas[0].length==mas2.mas[0].length) ) {
            for (int i = 0; i < mas1.mas.length; i++) {
                for (int j = 0; j < mas1.mas[0].length; j++) {
                    if (mas1.mas[i][j].equals(mas2.mas[i][j])) { answer+=1;}
                }
            }
            if (answer==ok) {
                return true;
            }
            else {
                return false;}
        }
        else {
            System.out.println("Розмірності матриць не співпадають");
            return false;}
    }

    public static Matrix odmat(int n ){ // одинична матриця
        Matrix my = new Matrix(n, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i!=j){
                    my.mas[i][j] ="0";
                }
                else {
                    my.mas[i][j] ="1";
                }
            }
        }
        return my ;
    }

    public static Matrix transmat(Matrix mymas){
        Matrix my = new Matrix(mymas.mas[0].length, mymas.mas.length);
        for (int i = 0; i < mymas.mas.length; i++) {
            for (int j = 0; j < mymas.mas[0].length; j++) {
                my.mas[j][i]=mymas.mas[i][j];
            }
        }
        return my;
    }

    public static Matrix keyVal(String[][]mas1) { //for test
        int n=mas1.length;
        int m= mas1[0].length;
        Matrix my = new Matrix(n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                my.mas[i][j] = mas1[i][j];
            }
        }
        return my;
    }


}


