import org.junit.Test;

import static org.testng.Assert.assertEquals;

public class JUnitTest {
    //Test findMax function
    @Test
    public void test__validArrays_findMax() {
        Finder finder = new Finder();
        //Test For Correct Answer
        int[] array = new int[]{-1,3,2,0,5};
        int expectedResult = 5;
        int actualResult = finder.findMax(array);
        assertEquals(actualResult,expectedResult);

        array = new int[] {-1000, -500, -1090, -10};
        expectedResult = -10;
        actualResult = finder.findMax(array);
        assertEquals(actualResult, expectedResult);
    }
    //Test when array is null
    @Test
    public void test_NullArray_findMax() {
        Finder finder = new Finder();
        int[] nullArray = null;
        Integer expectedResult = null;
        Integer actualResult = finder.findMax(nullArray);
        assertEquals(actualResult, expectedResult);
    }
    //Test when array is empty
    @Test
    public void test_EmptyArray_findMax() {
        Finder finder = new Finder();
        int[] array = new int[] {};
        Integer expectedResult = null;
        Integer acutalResult = finder.findMax(array);
        assertEquals(acutalResult, expectedResult);
    }

    //Test findMin function
    @Test
    public void test_findMin() {
        Finder finder = new Finder();
        //Test For Correct Answer
        int[] array = new int[]{-1,3,2,0,5};
        int expectedResult = -1;
        int actualResult = finder.findMin(array);
        assertEquals(actualResult,expectedResult);

        //Test when array is null
        int[] nullArray = null;
        Integer nullExpectedResult = null;
        Integer result = finder.findMin(nullArray);
        assertEquals(result, nullExpectedResult);

        //Test when array is empty
        array = new int[] {};
        result = finder.findMax(array);
        assertEquals(result, nullExpectedResult);
    }
    //Test when array is null
    @Test
    public void test_nullArray_findMin() {
        Finder finder = new Finder();
        int[] nullArray = null;
        Integer expectedResult = null;
        Integer actualResult = finder.findMin(nullArray);
        assertEquals(actualResult, expectedResult);
    }
    //Test when array is empty
    @Test
    public  void test_emptyArray_findMin() {
        Finder finder = new Finder();
        int[] array = new int[] {};
        Integer expectedResult = null;
        Integer acutalResult = finder.findMin(array);
        assertEquals(acutalResult, expectedResult);
    }
}