
class Solution {
    public int countDigitOne(int n) {
        int count = 0;

        for (long place = 1; place <= n; place *= 10) {
            long divider = place * 10;

            count += (int) ((n / divider) * place
                    + Math.min(Math.max(n % divider - place + 1, 0), place));
        }

        return count;
    }
}

