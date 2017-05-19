package leetcode;

/**
 * leetcode
 * Created by wjw on 19/05/2017.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for (int num1 : nums) {
            xor ^= num1;
        }
        return xor;
    }
}
