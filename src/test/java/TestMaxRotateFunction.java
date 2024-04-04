import main.java.learning.lessons.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestMaxRotateFunction {
    static Solution solution = new Solution();
    int[] nums = {414,3,2,6};

    //проверка типа "если я введу значения x и y, будет ли результат z?".
    @Test
    public void testFunc1() throws Exception {
        Assertions.assertEquals(26, solution.maxRotateFunction(nums));
    }

    //тест на ограничение nums[i] и проверок типа
    @Test
    public void testFunc2() throws Exception {
        if (!(nums instanceof int[]))
            throw new Exception("nums is not int");


        if (nums.length < 1 || nums.length > Math.pow(10, 5))
            throw new Exception("n is not between 1 and 10^5");

        for (int j : nums) {
            if (j > 100 || j < -100)
                throw new Exception("nums[i] = "+ j +" is not between -100 and 100");
        }
    }

    @Test
    public void testFunc3() throws Exception {

    }

}
