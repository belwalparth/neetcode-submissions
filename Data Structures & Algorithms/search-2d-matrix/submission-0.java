class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0,r=(matrix.length*matrix[0].length)-1;
        while(l<=r){
            int m=l+((r-l)/2);
            if(matrix[(m/matrix[0].length)][(m% matrix[0].length)]==target){
                return true;
            }
            else if(matrix[(m/matrix[0].length)][(m%matrix[0].length)]>target){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return false;
    }
}
