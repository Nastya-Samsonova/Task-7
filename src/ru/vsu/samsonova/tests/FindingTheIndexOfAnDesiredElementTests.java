package ru.vsu.samsonova.tests;

import ru.vsu.samsonova.logic.FindingTheIndexOfAnDesiredElement;
import org.junit.Test;
import org.junit.Assert;

public class FindingTheIndexOfAnDesiredElementTests {
    @Test
    public void findIndexOfDesiredElementTest1() {
        int testArray1 = FindingTheIndexOfAnDesiredElement.findDesiredArrayElement(new int[]{0, -29, 67, 34, 12});
        int result = 3;
        Assert.assertEquals(testArray1, result);
    }

    @Test
    public void findIndexOfDesiredElementTest2() {
        int testArray2 = FindingTheIndexOfAnDesiredElement.findDesiredArrayElement(new int[]{-1000, 23, 15, -1, 69, 1000000, 107});
        int result = 6;
        Assert.assertEquals(testArray2, result);
    }

    @Test
    public void findIndexOfDesiredElementTest3() {
        int testArray3 = FindingTheIndexOfAnDesiredElement.findDesiredArrayElement(new int[]{0});
        int result = 0;
        Assert.assertEquals(testArray3, result);
    }

    @Test
    public void findIndexOfDesiredElementTest4() {
        int testArray4 = FindingTheIndexOfAnDesiredElement.findDesiredArrayElement(new int[]{123, 12});
        int result = 0;
        Assert.assertEquals(testArray4, result);
    }

    @Test
    public void findIndexOfDesiredElementTest5() {
        int testArray5 = FindingTheIndexOfAnDesiredElement.findDesiredArrayElement(new int[]{830, 44, 6500, -22, -500, 303});
        int result = 5;
        Assert.assertEquals(testArray5, result);
    }

    @Test
    public void findIndexOfDesiredElementTest6() {
        int testArray6 = FindingTheIndexOfAnDesiredElement.findDesiredArrayElement(new int[]{1, -40000, -523, 0});
        int result = 2;
        Assert.assertEquals(testArray6, result);
    }

    @Test
    public void findIndexOfDesiredElementTest7() {
        int testArray7 = FindingTheIndexOfAnDesiredElement.findDesiredArrayElement(new int[]{-1, 1});
        int result = 0;
        Assert.assertEquals(testArray7, result);
    }

    @Test
    public void findIndexOfDesiredElementTest8() {
        int testArray8 = FindingTheIndexOfAnDesiredElement.findDesiredArrayElement(new int[]{-700, -3, -8000000,
                -969, -58, -20000, -10, -555, -22222222});
        int result = 7;
        Assert.assertEquals(testArray8, result);
    }

    @Test
    public void findIndexOfDesiredElementTest9() {
        int testArray9 = FindingTheIndexOfAnDesiredElement.findDesiredArrayElement(new int[]{39, 17, 666, 94, 5});
        int result = 3;
        Assert.assertEquals(testArray9, result);
    }

    @Test
    public void findIndexOfDesiredElementTest10() {
        int testArray10 = FindingTheIndexOfAnDesiredElement.findDesiredArrayElement(new int[]{-18, 21, 999, 10, -18, 999, -18, 1});
        int result = 3;
        Assert.assertEquals(testArray10, result);
    }
}
