package win.suroot.leetCode.lc0003_LongestSubstringWithoutRepeatingCharacters;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author qianlei
 * @create 2019-11-12 17:05
 * @desc
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }

    public static int lengthOfLongestSubstring2(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int maxLength = 0;
        char[] chars = s.toCharArray();
        int pointStart = -1, pointEnd = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int i1 = pointEnd; i1 > pointStart; i1--) {
                if (chars[i] == chars[i1]) {
                    pointStart = i1;
                    break;
                }
            }
            pointEnd = i;

            if ((pointEnd - pointStart) > maxLength) {
                maxLength = (pointEnd - pointStart);
            }
        }
        return pointStart == 0 ? maxLength + 1 : maxLength;
    }

    public static void main(String[] args) {
        String param = "abcabcbb";
        String param1 = " ";
        String param2 = "aa";
        String param3 = "au";
        int value = lengthOfLongestSubstring2(param2);
        System.out.printf("结果：" + value);
    }


}
