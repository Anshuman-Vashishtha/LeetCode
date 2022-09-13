class Kadane_Algorithm
{
    public static void main (String[] args)
    {
        int [] nums = {1,6,-3,3};
        System.out.println("Maximum contiguous sum is " +
                maxSubArray(nums));
    }
         static int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int cursum=0;
        for(int i=0;i<nums.length;i++)
        {
            cursum=cursum+nums[i];
            if(cursum>maxsum)
            {
                maxsum=cursum;
            }
            if(cursum<0)
            {
                cursum=0;
            }

        }
        return maxsum;
    }}
