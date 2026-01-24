class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;

        int i = 0, n = s.length();
        int sign = 1;
        long result = 0;

        // 1. Skip leading whitespace
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Check sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3. Convert digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            // 4. Clamp to 32-bit range
            if (sign * result <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (sign * result >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            i++;
        }

        return (int) (sign * result);
    }
}
