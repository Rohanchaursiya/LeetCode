import java.util.*;

class Solution {
    class DSU {
        int[] parent;
        int[] size;

        public DSU(int n) {
            parent = new int[n + 1];
            size = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                parent[i] = i; 
                size[i] = 1; 
            }
        }
        public int find(int u) {
            if (parent[u] != u) {
                parent[u] = find(parent[u]); 
            }
            return parent[u];
        }
        public void unionBySize(int u, int v) {
            int pu = find(u);
            int pv = find(v);

            if (pu != pv) {
                if (size[pu] >= size[pv]) {
                    parent[pv] = pu;
                    size[pu] += size[pv];
                } else {
                    parent[pu] = pv;
                    size[pv] += size[pu];
                }
            }
        }
    }

    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        DSU dsu = new DSU(n);
        int[] result = new int[2];

        for (int[] edge : edges) {
            int x = edge[0];
            int y = edge[1];

            int px = dsu.find(x);
            int py = dsu.find(y);

            if (px == py) {
                result[0] = x;
                result[1] = y;
            } else {
                dsu.unionBySize(x, y);
            }
        }

        return result;
    }
}