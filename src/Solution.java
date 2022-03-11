public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int begin = 0;
        int end = nums.length - 1;
        int[] arr = new int[2];

        while (true) {
            if (Math.abs(nums[begin]) + Math.abs(nums[begin]) > Math.abs(target)) {
                end--;
            } else if (Math.abs(nums[begin]) + Math.abs(nums[begin]) < Math.abs(target)) {
                begin++;
            } else {
                arr[0] = begin;
                arr[1] = end;
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] inputArr = {-1, -2, -3, -4, -5};
        int[] result;
        int target = -8;
        Solution solution = new Solution();
        result = solution.twoSum(inputArr, target);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }
}

