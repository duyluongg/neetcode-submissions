class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int value = map.get(s.charAt(i));
                map.put(s.charAt(i), value + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        Map<Character, Integer> mapp = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (mapp.containsKey(t.charAt(i))) {
                int value = mapp.get(t.charAt(i));
                mapp.put(t.charAt(i), value + 1);
            } else {
                mapp.put(t.charAt(i), 1);
            }
        }
        if (map.equals(mapp)) {
            return true;

        } else {
            return false;
        }
    }
}
