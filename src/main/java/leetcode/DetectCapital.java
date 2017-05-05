package leetcode;

/**
 * leetcode
 * Created by wjw on 05/05/2017.
 */
public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        String upCase = word.toUpperCase();
        String lowCase = word.toLowerCase();
        if (upCase.equals(word) || lowCase.equals(word)) {
            return true;
        }
        if (word.length() > 1 && lowCase.substring(1).equals(word.substring(1))){
            return true;
        }
        return false;
    }
}
