class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int index = 0;
        int check = 1;
        while (check < nums.length) {
            if (nums[check] != nums[index]) {
                index++;
                nums[index] = nums[check];
            }
            check++;
        }
        return index+1;
    }
}