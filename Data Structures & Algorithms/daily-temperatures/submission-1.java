class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int []> temp=new Stack<>();
        int[] res=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            int t=temperatures[i];
            while(!temp.isEmpty()&& t>temp.peek()[0])
            {
                int[] pair= temp.pop();
                res[pair[1]]=i-pair[1];
            }
            temp.push(new int[]{t,i});
        }
        return res;
    }
}
