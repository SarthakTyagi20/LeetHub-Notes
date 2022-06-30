class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int l=0, u=m-1;
        while(l<=u){
            int mid = l+(u-l)/2;
            if(matrix[mid][0] == target){
                // System.out.println("found at mid:"+mid);
                return true;
            }
            if(matrix[mid][0]>target){
                // System.out.println("u dec, mid:"+mid);
                u=mid-1;
            }
            else if(matrix[mid][0]<=target && matrix[mid][n-1]>=target){
                // System.out.println("mid:"+mid);
                return bs(matrix, mid, 0, n-1, target);
            }
            else if(matrix[mid][0]<target){
                // System.out.println("l inc, mid:"+mid);
                l=mid+1;
            }
        }
        return false;
    }
    public boolean bs(int[][] mat, int i, int l, int h, int e){
        if(l<=h){
            int mid = l+(h-l)/2;
            if(mat[i][mid]==e){
                // System.out.println("found1 mid:"+mid + " i:"+i);
                return true;
            }
            if(mat[i][mid]>e){
                // System.out.println("h dec, mid:"+mid);
                return bs(mat, i, l, mid-1, e);
            }
            else{
                // System.out.println("l inc1, mid:"+mid);
                return bs(mat, i, mid+1, h, e);
            }
        }
        else{
            return false;
        }
    }
}