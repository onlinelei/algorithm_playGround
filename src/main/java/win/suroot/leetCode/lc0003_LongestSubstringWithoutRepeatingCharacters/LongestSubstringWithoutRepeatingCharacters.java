package win.suroot.leetCode.lc0003_LongestSubstringWithoutRepeatingCharacters;

import java.util.ArrayList;

/**
 * @author qianlei
 * @create 2019-11-12 17:05
 * @desc
 */
public class LongestSubstringWithoutRepeatingCharacters {

    /**
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
     * 示例 1:
     * 输入: "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     * 示例 2:
     * 输入: "bbbbb"
     * 输出: 1
     * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
     * 示例 3:
     * 输入: "pwwkew"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     *
     * @author: qianlei
     * @date: 2019-11-12 17:05
     */

    public int lengthOfLongestSubstring(String s) {

        int maxLength = 0;
        char[] temp = new char[]{};
        ArrayList<Character> tempArray = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char charTemp = s.charAt(i);
            // 判断是否在数组中重复
            for (int j = 0; j < temp.length; j++) {
                if (charTemp == temp[j]) {
                    // 保存最大长度
                    maxLength = temp.length;
                    // 删除
                }
            }

        }



        return 0;
    }
}
