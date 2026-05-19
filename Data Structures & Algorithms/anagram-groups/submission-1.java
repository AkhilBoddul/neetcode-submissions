class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] freqArr = new int[26];
        String hashKey = "";
        List<String> tempList = new ArrayList<>();
        List<List<String>> outputList = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                freqArr[strs[i].charAt(j) - 'a']++;
            }

            hashKey = Arrays.toString(freqArr);

            if (map.containsKey(hashKey))
                map.get(hashKey).add(strs[i]);
            else {
                tempList.add(strs[i]);
                map.put(hashKey, tempList);
            }

            freqArr = new int[26];
            tempList = new ArrayList<>();
        }

        for (List<String> values : map.values()) {
            outputList.add(values);
        }

        return outputList;
    }
}
