class Solution {
    public boolean isIsomorphic(String s, String t) {
           if (s.length() != t.length()) return false;

        Map<Character, Character> mapS2T = new HashMap<>();
        Map<Character, Character> mapT2S = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // If either mapping conflicts, return false
            if ((mapS2T.containsKey(c1) && mapS2T.get(c1) != c2) ||
                (mapT2S.containsKey(c2) && mapT2S.get(c2) != c1)) {
                return false;
            }

            mapS2T.put(c1, c2);
            mapT2S.put(c2, c1);
        }
        return true;
    }
}
