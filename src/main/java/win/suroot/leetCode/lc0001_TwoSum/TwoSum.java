package win.suroot.leetCode.lc0001_TwoSum;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author qianlei
 * @create 2019-11-09 22:41
 * @desc 两数之和
 */
public class TwoSum {

    /**
     * 暴力破解
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 利用Set特性查询
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> temp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complement = target - nums[i];
            if (temp.containsKey(complement)) {
                return new int[]{i, temp.get(complement)};
            }

            temp.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");

    }
}
