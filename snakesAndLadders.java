class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        boolean[] vis = new boolean[n * n + 1];
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        vis[1] = true;

        int moves = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int curr = q.poll();
                if (curr == n * n) return moves;

                for (int dice = 1; dice <= 6 && curr + dice <= n * n; dice++) {
                    int next = curr + dice;
                    int[] pos = getPos(next, n);
                    if (board[pos[0]][pos[1]] != -1)
                        next = board[pos[0]][pos[1]];

                    if (!vis[next]) {
                        vis[next] = true;
                        q.offer(next);
                    }
                }
            }
            moves++;
        }
        return -1;
    }

    private int[] getPos(int num, int n) {
        int r = (num - 1) / n;
        int c = (num - 1) % n;
        if (r % 2 == 1) c = n - 1 - c;
        return new int[]{n - 1 - r, c};
    }
}
