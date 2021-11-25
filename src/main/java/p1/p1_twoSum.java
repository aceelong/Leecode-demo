package p1;

import java.util.ArrayList;

/**
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 示例 2：
 * <p>
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * 示例 3：
 * <p>
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * 只会存在一个有效答案
 * 进阶：你可以想出一个时间复杂度小于 O(n2) 的算法吗？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class p1_twoSum {
    int[] twoSum(int[] array, int target) {

        int left = 0, right = array.length - 1;
        for (int i = 0 ; i< array.length-1; i++){
            for ( int j = i+1;j<array.length;j++){
                if (array[i] + array[j] == target)
                    return new int[]{i,j};
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        p1_twoSum p1_twoSum = new p1_twoSum();
        int arr[] = new int[]{1,23,4,5,6};
        int target = 6;
        int res[] = p1_twoSum.twoSum(arr,target);
        System.out.println("第一个数的索引为" + res[0] + "第二个数的索引为" + res[1]);

    }

}
