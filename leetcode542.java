class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        Queue <int[]> q = new LinkedList<>();
        int dirs[][] = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if(mat[i][j] == 0){
                    q.offer(new int[]{i,j});
                } else {
                    mat[i][j] = -1;
                }
            }
        }
        while (!q.isEmpty()){
            int curr[] = q.poll();

            for (int[] d : dirs){
                int r = curr[0] + d[0];
                int c = curr[1] + d[1];

                if (r >= 0 && r < m && c >= 0 && c < n && mat[r][c] == -1){
                    mat[r][c] = mat[curr[0]] [curr[1]] + 1;
                    q.offer(new int[]{r, c});
                }
            }
        }
                    return mat;

    }
}
