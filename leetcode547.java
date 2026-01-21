class Solution {
    public int findCircleNum(int[][] isConnected) {
         int count = 0;
         int n = isConnected.length;
        boolean[] visited = new boolean[n];
            for (int i = 0; i < n; i++){
                if(!visited[i]){
                    dfs(i, isConnected, visited);
                    count++;
                }
            }
                            return count;

    }
        private void dfs(int city, int[][] isConnected, boolean[] visited){
            visited[city] = true;
            for (int neighbour = 0; neighbour < isConnected.length; neighbour++){
                if (isConnected[city][neighbour] == 1 && !visited[neighbour]){
                    dfs(neighbour, isConnected, visited); //Each time we move:neighborv becomes new city
                }
            }
        }
    
}
