package leetcode;

import java.util.ArrayList;

public class KeyboardRow {

    public String[] findWords(String[] words) {
        ArrayList<String> result = new ArrayList<String>();
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        for (String word : words) {
            int atRow = -1;
            boolean isOneRow = true;
            for (char c : word.toLowerCase().toCharArray()) {
                int currentRow = -1;
                if (row1.indexOf(c) != -1) {
                    currentRow = 1;
                }
                if (row2.indexOf(c) != -1) {
                    currentRow = 2;
                }
                if (row3.indexOf(c) != -1) {
                    currentRow = 3;
                }
                if (atRow == -1) {
                    atRow = currentRow;
                    continue;
                }
                if (atRow != currentRow) {
                    isOneRow = false;
                    break;
                }
            }
            if (isOneRow) {
                result.add(word);
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
