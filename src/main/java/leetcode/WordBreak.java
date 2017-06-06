package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * leetcode
 * Created by wjw on 27/05/2017.
 */
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        return s.length() != 0 && helper2(s, wordDict);
    }

    private static boolean helper(String s, List<String> wordDict) {
        List<String> list = getSameStartStrs(s, wordDict);
        if (list.size() == 0) {
            return false;
        }
        for (String tmp : list) {
            if (s.length() == tmp.length()) {
                return true;
            }
            if (s.length() > tmp.length()) {
                if (helper(s.substring(tmp.length()), wordDict)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static List<String> getSameStartStrs(String s, List<String> wordDict) {
        List<String> result = new ArrayList<String>();
        for (String str : wordDict) {
            if (s.startsWith(str)) {
                result.add(str);
            }
        }
        return result;
    }

    public static boolean helper2(String s, List<String> wordDict) {
        int length = s.length();
        boolean[] stateArr = new boolean[length + 1];
        Arrays.fill(stateArr, false);
        stateArr[0] = true;
        for (int index = 1; index <= length; index++) {
            for (int past = index - 1; past >= 0; past--) {
                if (stateArr[past] && wordDict.contains(s.substring(past, index))) {
                    stateArr[index] = true;
                    break;
                }
            }
        }
        return stateArr[length];
    }
}
