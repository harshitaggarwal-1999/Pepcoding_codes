import java.util.*;

public class swiminrisingwater {
    public class pair implements Comparable<pair> {
        int row;
        int col;
        int msf;

        pair(int row, int col, int msf) {
            this.row = row;
            this.col = col;
            this.msf = msf;
        }

        @Override
        public int compareTo(pair o) {
            return this.msf - o.msf;
        };

    }

    public int swimInWater(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid.length];
        PriorityQueue<pair> pq = new PriorityQueue<>();
        int[][] dirs = { { -1, 0 }, { 0, 1 }, { 0, -1 }, { 1, 0 } };

        pq.add(new pair(0, 0, grid[0][0]));

        while (pq.size() > 0) {
            pair rem = pq.remove();

            // answer phase
            if (rem.row == grid.length - 1 && rem.col == grid.length - 1) {
                return rem.msf;
            }

            // basic djikstra implementation
            if (visited[rem.row][rem.col] == true) {
                continue;
            }

            visited[rem.row][rem.col] = true;
            for (int i = 0; i < dirs.length; i++) {
                int rowdash = rem.row + dirs[i][0];
                int coldash = rem.col + dirs[i][1];

                if (rowdash > grid.length - 1 || coldash > grid.length - 1 || rowdash < 0 || coldash < 0
                        || visited[rowdash][coldash] == true) {
                    continue;
                }

                pq.add(new pair(rowdash, coldash, Math.max(rem.msf, grid[rowdash][coldash])));

            }

        }
        return 0;
    }

}
