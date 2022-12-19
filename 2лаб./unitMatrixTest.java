import org.junit.Assert;

import static org.junit.Assert.*;

public class unitMatrixTest {

    @org.junit.Test
    public void odmat() {
        unitMatrix unitmas=new unitMatrix();
        String actual[][]=unitmas.odmat(3);
        String expected [][] ={
                {"1", "0", "0"},
                {"0", "1", "0"},
                {"0", "0", "1"}
        };
        assertArrayEquals(expected,actual);
    }
}