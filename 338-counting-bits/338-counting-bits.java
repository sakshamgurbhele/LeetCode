class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        int[] base = new int[]{0, 1, 1, 2};
        if (n <= 3) {
            for (int i = 0; i <= n; i ++) {
                result[i] = base[i];
            }
           return result; 
        }
        int diff = 2;
        int add = 0;
        int start = 4;
        int j = start - diff;
        for (int i = 0; i <= 3; i ++) {
            result[i] = base[i];
        }
        for (int i = 4; i <= n; i ++) {
            result[i] = result[j] + add;
            j ++;
            if (j == start) {
                if (add == 0) {
                    add = 1;
                    j = start - diff;
                }
                else {
                    add = 0;
                    diff = diff << 1;
                    start = i + 1;
                    j = start - diff;
                }
            }
        }
        return result;
    }
}