class Pair {
    int first;
    long second;
    Pair(int f, long s) {
        first = f;
        second = s;
    }
}

class Solution {
    public int countPaths(int n, int[][] roads) {
        ArrayList<ArrayList<Pair>> al = new ArrayList<>();
        int mod = (int)(1e9 + 7);
        for (int i = 0; i < n; i++) {
            al.add(new ArrayList<>());
        }
        for (int i = 0; i < roads.length; i++) {
            int u = roads[i][0];
            int v = roads[i][1];
            int wt = roads[i][2];
            al.get(u).add(new Pair(v, wt));
            al.get(v).add(new Pair(u, wt));
        }
        long[] dist = new long[n];
        int[] ways = new int[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        Arrays.fill(ways, 0);
        dist[0] = 0;
        ways[0] = 1;
        PriorityQueue<Pair> q = new PriorityQueue<>((a, b) -> Long.compare(a.second, b.second)); 
        q.add(new Pair(0, 0));
        
        while (!q.isEmpty()) {
            Pair temp = q.poll();
            int v = temp.first;
            long wt = temp.second;
            if (wt > dist[v]) continue;

            for (int i = 0; i < al.get(v).size(); i++) {
                Pair t = al.get(v).get(i);
                int u = t.first;
                long time = t.second;
                if ((time + wt) < dist[u]) {
                    dist[u] = time + wt;
                    q.add(new Pair(u, dist[u]));
                    ways[u] = ways[v];
                } else if (time + wt == dist[u]) {
                    ways[u] = (ways[u] + ways[v]) % mod;
                }
            }
        }
        return ways[n - 1] % mod;
    }
}