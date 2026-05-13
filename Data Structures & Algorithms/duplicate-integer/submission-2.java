class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set hashtable = new HashSet<>();
        for (int i : nums) {
            if (!hashtable.add(i))
                return true;
        }
        return false;
    }
}