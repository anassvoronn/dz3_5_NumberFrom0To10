package org.dz.solution;

import org.junit.Assert;
import org.junit.Test;


public class NumberFrom0To10CheckerTest {

    @Test
    public void checker5() {
        NumberFrom0To10Checker checker = new NumberFrom0To10Checker();
        boolean result = checker.check(5, false);
        Assert.assertTrue(result);
    }

    @Test
    public void checker2() {
        NumberFrom0To10Checker checker = new NumberFrom0To10Checker();
        boolean result = checker.check(2, false);
        Assert.assertTrue(result);
    }

    @Test
    public void checkerMinus4() {
        NumberFrom0To10Checker checker = new NumberFrom0To10Checker();
        boolean result = checker.check(-4, false);
        Assert.assertFalse(result);
    }

    @Test
    public void checker15() {
        NumberFrom0To10Checker checker = new NumberFrom0To10Checker();
        boolean result = checker.check(15, false);
        Assert.assertFalse(result);
    }

    @Test
    public void checker5Strict() {
        NumberFrom0To10Checker checker = new NumberFrom0To10Checker();
        boolean result = checker.check(5, true);
        Assert.assertTrue(result);
    }

    @Test
    public void checker2Strict() {
        NumberFrom0To10Checker checker = new NumberFrom0To10Checker();
        boolean result = checker.check(2, true);
        Assert.assertTrue(result);
    }

    @Test
    public void checkerMinus4Strict() {
        NumberFrom0To10Checker checker = new NumberFrom0To10Checker();
        boolean result = checker.check(-4, true);
        Assert.assertFalse(result);
    }

    @Test
    public void checker15Strict() {
        NumberFrom0To10Checker checker = new NumberFrom0To10Checker();
        boolean result = checker.check(15, true);
        Assert.assertFalse(result);
    }

    @Test
    public void checker0Strict() {
        NumberFrom0To10Checker checker = new NumberFrom0To10Checker();
        boolean result = checker.check(0, true);
        Assert.assertTrue(result);
    }

    @Test
    public void checker10Strict() {
        NumberFrom0To10Checker checker = new NumberFrom0To10Checker();
        boolean result = checker.check(10, true);
        Assert.assertTrue(result);
    }

    @Test
    public void checker0() {
        NumberFrom0To10Checker checker = new NumberFrom0To10Checker();
        boolean result = checker.check(0, false);
        Assert.assertFalse(result);
    }

    @Test
    public void checker10() {
        NumberFrom0To10Checker checker = new NumberFrom0To10Checker();
        boolean result = checker.check(10, false);
        Assert.assertFalse(result);
    }
}