import org.junit.Test;

import static org.junit.Assert.*;

public class transposedMatrixTest {

    @Test
    public void transmat() {
        transposedMatrix transmas=new transposedMatrix();
        String mas1 [][] ={
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };
        String actual[][]=transmas.transmat(mas1);
        String expected [][] ={
                {"1", "4", "7"},
                {"2", "5", "8"},
                {"3", "6", "9"}
        };
        assertArrayEquals(expected,actual);
    }
}