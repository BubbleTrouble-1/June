class Solution {
    public int[] findMissingRepeatingNumbers(int[] nums) {
        long n = nums.length;
        long ns1 = (n*(n+1)) / 2;
        long ns2 = (n*(n+1)*(2*n+1))/6;
        long as1 = 0, as2 = 0;
        for(int i=0;i<n;i++){
            as1 += nums[i];
            as2 += (long)nums[i] * (long)nums[i];
        }
        long val1 = ns1 - as1;
        long val2 = ns2 - as2;
        val2 = val2/val1;
        long repeat = (val1+val2)/2;
        long miss = repeat - val1;
        return new int[]{(int) repeat,(int) miss};
    }
}
