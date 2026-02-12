class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        // If lengths mismatch, return false
        if (pattern.length() != words.length) {
            return false;
        }

        // Two HashMaps for bidirectional mapping
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = words[i];

            // If character already mapped
            if (map1.containsKey(ch)) {
                // If mapping doesn't match, return false
                if (!map1.get(ch).equals(word)) {
                    return false;
                }
            } else {
                map1.put(ch, word);
            }

            // If word already mapped
            if (map2.containsKey(word)) {
                // If reverse mapping doesn't match, return false
                if (map2.get(word) != ch) {
                    return false;
                }
            } else {
                map2.put(word, ch);
            }
        }

        return true;
    }
}
