class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=1;
        for(int i:piles){
            if(i>max)
            max=i;
        }
        int l=1,r=max,m=1;
        while(l<=r){
            m=l+((r-l)/2);
            double t=0;
            for(int i:piles){
                t=t+Math.ceil((double)i/m);
            }
            if(t>h){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return l;
    }
}
