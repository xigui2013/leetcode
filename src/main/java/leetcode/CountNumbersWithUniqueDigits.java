package leetcode;

/**
 * leetcode
 * Created by wjw on 15/05/2017.
 */
public class CountNumbersWithUniqueDigits {
    public int countNumbersWithUniqueDigits(int n) {
        if (n > 10){
            return 8877691;
        }
        int result = 1;
        while (n > 0){
            result += getNum(10, n);
            n--;
        }
        return result;
    }
    public int getNum(int n, int m) {
        int result = n - 1;
        --n;
        while (m - 1 > 0) {
            result *= n;
            --m;
            --n;
        }
        return result;
    }
}
