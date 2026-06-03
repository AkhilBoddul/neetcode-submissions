class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        int maxLength = 0;

        for (int n : nums) numsSet.add(n);

        for (int n : numsSet) {
            if (!numsSet.contains(n - 1)) {
                int currLength = 1;
                while (numsSet.contains(n + currLength)) {
                    currLength++;
                }
                maxLength = Integer.max(currLength, maxLength);
            }
        }

        return maxLength;
    }
}
