import java.util.*;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int index = 0;
        while (index < strs[0].length() && strs[0].charAt(index) == strs[strs.length-1].charAt(index))
            index++;
        return strs[0].substring(0, index);
    }
}
