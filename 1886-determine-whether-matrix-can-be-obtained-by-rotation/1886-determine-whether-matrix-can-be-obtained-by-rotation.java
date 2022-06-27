class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        for(int i=0; i<4; i++){
            if(Arrays.deepEquals(mat, target))
                return true;
            mat = rotate(mat);
        }
        return false;
    }
    public int[][] rotate(int[][] mat){
        int n = mat.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int x = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = x;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<(n/2); j++){
                int x = mat[i][j];
                mat[i][j] = mat[i][n-1-j];
                mat[i][n-1-j] = x;
            }
        }
        return mat;
    }
}