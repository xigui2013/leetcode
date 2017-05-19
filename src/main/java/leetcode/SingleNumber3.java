package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * leetcode
 * Created by wjw on 19/05/2017.
 */
public class SingleNumber3 {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        Integer flag;
        for (int num : nums) {
            flag = numMap.get(num);
            if (flag == null) {
                numMap.put(num, 1);
            } else {
                numMap.put(num, 2);
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (Map.Entry<Integer, Integer> a:numMap.entrySet()) {
            if(a.getValue() == 1){
                arrayList.add(a.getKey());
            }
        }
        int[] result = new int[arrayList.size()];
        for (int index = 0; index < arrayList.size(); index++){
            result[index] = arrayList.get(index);
        }
        return result;
    }

    public  int[] singleNumber2(int[] nums){
        // 找出x1 与 x2的异或结果
        int xor = 0;
        for (int num1 : nums) {
            xor ^= num1;
        }
        // 找到某个x1与x2不同的二进制位
        int lastBit = xor - (xor & (xor - 1));
        int group0 = 0, group1 = 0;
        // 通过与将 数字分组，然后再异或找到组内不重复的那个数
        for (int num : nums) {
            if ((lastBit & num) == 0) {
                group0 ^= num;
            } else {
                group1 ^= num;
            }
        }
        return new int[]{group0, group1};
    }
}
