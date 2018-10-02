package week3;

import org.junit.Assert;
import org.junit.Test;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void Test_Max(){
        Week3 week3 = new Week3();
        Assert.assertEquals(5, week3.max(5,2));
        Assert.assertEquals(42, week3.max(15,42));
        Assert.assertEquals(53, week3.max(53,22));
        Assert.assertEquals(5213, week3.max(5213,2423));
        Assert.assertEquals(1030, week3.max(1030,223));
    }
    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void Test_minOfArray(){
        int[] A = {1,2,3,4,5,3,232,123,123,54,546};
        int[] B ={4,6,3,-1,7,9,11,78,67,4,34,24};
        int[] C ={18,56,2,44,50000,623,3434,1212};
        int[] D ={123,-1,7,7777,999999,5544,45465};
        int[] E ={1,1,1,1,1,1,1,1,1,1};
        Assert.assertEquals(1,Week3.minOfArray(A));
        Assert.assertEquals(-1,Week3.minOfArray(B));
        Assert.assertEquals(2,Week3.minOfArray(C));
        Assert.assertEquals(-1,Week3.minOfArray(D));
        Assert.assertEquals(1,Week3.minOfArray(E));
    }
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testBMI(){
        Assert.assertEquals("Thiếu cân",Week3.calculateBMI(42,1.7));
        Assert.assertEquals("Bình thường",Week3.calculateBMI(61,1.7));
        Assert.assertEquals("Thừa cân",Week3.calculateBMI(66,1.65));
        Assert.assertEquals("Bèo phì",Week3.calculateBMI(80,1.68));
        Assert.assertEquals("Bình thường",Week3.calculateBMI(67,1.81));
    }
}
