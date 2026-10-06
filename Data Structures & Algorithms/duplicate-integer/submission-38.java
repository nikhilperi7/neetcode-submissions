class Solution {
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {  // only compare with later elements
                if (nums[i] == nums[j]) {
                    return true;                          // exit early on first duplicate
                }
            }
        }
        return false;                                     // checked every pair, none matched
    }
}