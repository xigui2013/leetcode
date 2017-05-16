package leetcode;

/**
 * leetcode
 * Created by wjw on 16/05/2017.
 */
public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int length = gas.length;
        int[] remain = new int[length];
        for (int index = 0; index < length; index++) {
            remain[index] = gas[index] - cost[index];
        }
        for (int flag = 0; flag < length; flag++) {
            if (remain[flag] < 0) {
                continue;
            }
            int index = flag + 1;
            int remainGas = remain[flag];
            boolean noway = false;
            while (index != flag) {
                if (index == length) {
                    index = 0;
                    continue;
                }
                remainGas += remain[index];
                if (remainGas < 0) {
                    noway = true;
                    break;
                }
                index++;
            }
            if (!noway) {
                return flag;
            }
        }
        return -1;
    }

    public int canCompleteCircuit2(int[] gas, int[] cost) {
        int sum = 0;
        int total = 0;
        int j = 0;
        for (int i = 0; i < gas.length; ++i) {
            sum += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if (sum < 0) {
                j = i + 1;
                sum = 0;
            }
        }
        if (total < 0) {
            return -1;
        }
        return j;
    }
}

