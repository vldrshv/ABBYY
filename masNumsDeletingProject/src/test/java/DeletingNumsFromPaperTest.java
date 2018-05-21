import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DeletingNumsFromPaperTest {
    DeleteNumsFromPaper d;

    @Before
    public void initialization(){
        d = new DeleteNumsFromPaper();
    }

    @Test
    public void deleteNumFromArray_NullArray_return_size_0(){
        int[] mas = {};
        int[] res = {};

        int size = d.deleteNumFromArray(mas, 2);
        Assert.assertArrayEquals(mas, res);
        Assert.assertEquals(size, 0);
    }

    @Test
    public void deleteNumFromArray_NotNullArray_return_size_0(){
        int[] mas = {2,2,2,2,2};
        int[] res = {2,2,2,2,2};

        int size = d.deleteNumFromArray(mas, 2);
        Assert.assertArrayEquals(mas, res);
        Assert.assertEquals(size, 0);
    }

    @Test
    public void deleteNumFromArray_return_size_1(){
        int[] mas = {1,2,2,2,2,2,2};
        int[] res = {1,2,2,2,2,2,2};

        int size = d.deleteNumFromArray(mas, 2);
        Assert.assertArrayEquals(mas, res);
        Assert.assertEquals(size, 1);
    }

    @Test
    public void deleteNumFromArray_return_size_2(){
        int[] mas = {1,2,2,2,2,2,3};
        int[] res = {1,3,2,2,2,2,2};

        int size = d.deleteNumFromArray(mas, 2);
        Assert.assertArrayEquals(mas, res);
        Assert.assertEquals(size, 2);
    }

    @Test
    public void deleteNumFromArray_return_size_5(){
        int[] mas = {1,11,2,11,3,11,4,11,11,11,11,11,11,5};
        int[] res = {1,2,3,4,5,11,11,11,11,11,11,11,11,11};

        int size = d.deleteNumFromArray(mas, 11);
        Assert.assertArrayEquals(mas, res);
        Assert.assertEquals(size, 5);
    }

    @Test
    public void deleteNumFromArray_return_size_9(){
        int[] mas = {11,1,2,3,4,11,11,11,5,11,6,11,11,11,7,11,8,11,11,11,11,11,11,11,11,9};
        int[] res = {1,2,3,4,5,6,7,8,9,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11};

        int size = d.deleteNumFromArray(mas, 11);
        Assert.assertArrayEquals(mas, res);
        Assert.assertEquals(size, 9);
    }

    @Test
    public void deleteNumFromArray_NotResized(){
        int[] mas = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        int[] res = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};

        int size = d.deleteNumFromArray(mas, 99);
        Assert.assertArrayEquals(mas, res);
        Assert.assertEquals(size, res.length);
    }

    @Test
    public void deleteNumFromArray_Highly_Thinned(){
        int[] mas = {1,11,11,11,11,11,11,11,2,11,11,11,11,11,11,11,3,11,11,11,11,11,11,11,4,11,11,11,11,11,11,11,
                5,11,11,11,11,11,11,11,6,11,11,11,11,11,11,11,7,11,11,11,11,11,11,11,8,11,11,11,11,11,11,11,
                9,11,11,11,11,11,11,11,10,11,11,11,11,11,11,11,11,11,11,11,11,11,11,12};
        int[] res = {1,2,3,4,5,6,7,8,9,10,12,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,
                11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,
                11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11};

        int size = d.deleteNumFromArray(mas, 11);
        Assert.assertArrayEquals(mas, res);
        Assert.assertEquals(size, 11);
    }

    @Test
    public void deleteNumFromArray_N2(){
        int[] mas = {10,10,10,10,10,10,10,10,10,1,2,3,4,5,6,7,8,9};
        int[] res = {1,2,3,4,5,6,7,8,9,10,10,10,10,10,10,10,10,10};

        int size = d.deleteNumFromArray(mas, 10);
        Assert.assertArrayEquals(mas, res);
        Assert.assertEquals(size, 9);
    }
}
