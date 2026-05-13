class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hashtable = new HashSet<>();
        for (int i : nums) {
            if (!hashtable.add(i))
                return true;
        }
        return false;
    }
}