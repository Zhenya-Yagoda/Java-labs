package com.itdvn.junit.lesson1;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    @org.junit.Test
    public void add1() {
        int t=StringCalculator.add("");
        int res=0;
        assertEquals(res, t);
    }
    @org.junit.Test
    public void add2() {
        int t=StringCalculator.add("1\n2");
        int res=3;
        assertEquals(res, t);
    }
    @org.junit.Test
    public void add3() {
        int t=StringCalculator.add("1\n2,1");
        int res=4;
        assertEquals(res, t);
    }
    @org.junit.Test
    public void add4() {
        int t=StringCalculator.add("//@@\n1@@2@@5");
        int res=8;
        assertEquals(res, t);
    }
    @org.junit.Test
    public void add5() {
        int t=StringCalculator.add("//[]\n1*222*33");
        int res=256;
        assertEquals(res, t);

    }
    @org.junit.Test
    public void add6() {
        int t=StringCalculator.add("//[*][;]\n1*222;33");
        int res=256;
        assertEquals(res, t);}
    @org.junit.Test
    public void add7() {
        int t=StringCalculator.add("1\n2\n3,4,5");
        int res=15;
        assertEquals(res, t);}


}