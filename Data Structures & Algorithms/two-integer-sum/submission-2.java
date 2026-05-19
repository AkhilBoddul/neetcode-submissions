class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsMap = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int j = target - nums[i];
            if (numsMap.containsKey(j) && numsMap.get(j) != i)
                return new int[] {numsMap.get(j), i};
            else
                numsMap.put(nums[i], i);
        }
        return new int[] {};
    }
}
