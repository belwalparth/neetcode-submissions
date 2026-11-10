class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prod=new int[nums.length];
        int bp=1,zero=0;
        for(int i : nums){
            if(i==0){
                zero++;
            continue;
            }
            bp*=i;
        }
        if(zero>1){
            return prod;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(zero==1 && nums[i]==0){
                prod[i]=bp;
                continue;
            }
            else if(zero==1 && nums[i]!=0)
            {
                prod[i]=0;
                continue;
            }
            prod[i]=bp/nums[i];
        }
        return prod;
    }
}  
