class Solution {
    public long maxProduct(int[] nums) {
        long largest = 0;
        long secondl = 0;
        for (int x : nums) {
            long v = x<0?-x:x;
            if (v > largest) {
                secondl = largest;
                largest = v;
            } else if (v > secondl) {
                secondl = v;
            }
        }
        return largest*secondl*100000;
    }
}