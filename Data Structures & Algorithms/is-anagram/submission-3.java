class Solution {
    public boolean isAnagram(String s, String t) {
        boolean flag = false;
        if (s.length() == t.length()) {
            HashMap<Character, Integer> sMap = new HashMap<>();
            HashMap<Character, Integer> tMap = new HashMap<>();
            for (char c : s.toCharArray()) {
                if (sMap.containsKey(c)) {
                    sMap.put(c, sMap.get(c) + 1);
                } else {
                    sMap.put(c, 1);
                }
            }
            for (char c : t.toCharArray()) {
                if (tMap.containsKey(c)) {
                    tMap.put(c, tMap.get(c) + 1);
                } else {
                    tMap.put(c, 1);
                }
            }
            for (Map.Entry<Character, Integer> entry : sMap.entrySet()) {
                // if (!(tMap.containsKey(entry.getKey()))
                // || !(Objects.equals(entry.getValue(), tMap.get(entry.getKey()))))
                // return false;

                if (tMap.containsKey(entry.getKey())) {
                    if ((Objects.equals(entry.getValue(), tMap.get(entry.getKey())))) {
                        flag = true;
                    } else {
                        flag = false;
                        return flag;
                    }
                } else {
                    flag = false;
                    return flag;
                }
            }
            return flag;
        }
        return flag;
    }
}
