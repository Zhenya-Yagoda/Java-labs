import org.junit.Test;

import static org.junit.Assert.*;

public class matrixTest {

    @Test
    public void copymas() {
        matrix mascopymas= new matrix();
        String mas1 [][] ={
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };
        String actual[][]=mascopymas.copymas(mas1);
        String expected [][] ={
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };
        assertArrayEquals(expected,actual);
    }

    @Test
    public void getrozm() {
        matrix masgetrozm= new matrix();
        String mas1 [][] ={
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };
        int actual[]=masgetrozm.getrozm(mas1);
        int expected [] ={3,3};
        assertArrayEquals(expected,actual);
    }
}