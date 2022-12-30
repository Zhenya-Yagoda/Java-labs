import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;

public class MatrixTest2 {

    @org.junit.Test
    public void copy() {
        String  m1[][] ={
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };
        Matrix mas=  Matrix.keyVal(m1);
        Matrix actual=  new Matrix("copy",mas.getrozm()[0], mas.getrozm()[1]).copy(mas);
        String m2 [][] ={
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };
        Matrix expected=  Matrix.keyVal(m2);
        assertArrayEquals(expected.mas,actual.mas);
    }


    @org.junit.Test
    public void getvalue() {
        String  m1[][] ={
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };
        Matrix mas=  Matrix.keyVal(m1);
        String actual=  mas.getvalue(1,2);
        String expected="Шуканий елемент - "+"2";
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void getR() {
        String  m1[][] ={
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };
        Matrix mas=  Matrix.keyVal(m1);
        String actual=  mas.getR(1);
        String expected="Шуканий рядок - "+"1 "+ "2 "+"3  ";
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void getS() {
        String  m1[][] ={
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };
        Matrix mas=  Matrix.keyVal(m1);
        String actual=  mas.getS(1);
        String expected="Шуканий стовпчик - "+"1 "+ "4 "+"7 ";
        assertEquals(expected,actual);
    }


    @org.junit.Test
    public void getrozm() {
        String  m1[][] ={
                {"1", "2", "3"},
                {"7", "8", "9"}
        };
        Matrix mas=  Matrix.keyVal(m1);
        int [] actual=  mas.getrozm();
        int [] expected={2 , 3};
        assertArrayEquals(expected,actual);
    }

    @org.junit.Test
    public void testEquals() {
        String  m1[][] ={
                {"1", "2", "3"},
                {"7", "8", "9"}
        };
        Matrix mas1=  Matrix.keyVal(m1);
        String  m2[][] ={
                {"1", "2", "3"},
                {"7", "8", "9"}
        };
        Matrix mas2=  Matrix.keyVal(m2);
        boolean actual=mas1.equals(mas2);
        boolean expected=true;
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void odmat() {
        Matrix actual=Matrix.odmat(3);
        String m2 [][] ={
                {"1", "0", "0"},
                {"0", "1", "0"},
                {"0", "0", "1"}
        };
        Matrix expected=  Matrix.keyVal(m2);
        assertArrayEquals(expected.mas,actual.mas);

    }

    @org.junit.Test
    public void transmat() {
        String  m1[][] ={
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };
        Matrix actual=Matrix.transmat(Matrix.keyVal(m1));
        String m2 [][] ={
                {"1", "4", "7"},
                {"2", "5", "8"},
                {"3", "6", "9"}
        };
        Matrix expected=  Matrix.keyVal(m2);
        assertArrayEquals(expected.mas,actual.mas);
    }
}