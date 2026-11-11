class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Double[][] pair= new Double[position.length][2];
        Stack<Double []> stack= new Stack<>();
        for(int i=0;i<position.length;i++){
            pair[i][0]=(double)position[i];
            pair[i][1]=(double)(target-position[i])/speed[i];
        }
        Arrays.sort(pair,(a,b)->Double.compare(b[0],a[0]));
        for(int i=0;i<position.length;i++){
        if(!stack.isEmpty() && pair[i][1]<=stack.peek()[1] && pair[i][0]<=stack.peek()[0]){
            continue;
                
        }
        stack.push(new Double[]{pair[i][0],pair[i][1]});
        }
        return stack.size();
    }
}
