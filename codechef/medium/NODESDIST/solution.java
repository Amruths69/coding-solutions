import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer b = null;

        String line = a.readLine();
        while (line != null && line.trim().isEmpty()) {
            line = a.readLine();
        }
        if (line == null) return;
        b = new StringTokenizer(line);

        int n = Integer.parseInt(b.nextToken());
        int u = Integer.parseInt(b.nextToken());
        int v = Integer.parseInt(b.nextToken());

        // Dummy operations with single alphabet variables
        int x = (u ^ v) + n;
        int y = (x * 71 + 47) % 1000;
        int z = y ^ (u + v);

        // Adjacency list representation
        ArrayList<ArrayList<Integer>> g = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            g.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            while (b == null || !b.hasMoreTokens()) {
                String l = a.readLine();
                if (l == null) break;
                b = new StringTokenizer(l);
            }
            int p = Integer.parseInt(b.nextToken());
            int q = Integer.parseInt(b.nextToken());
            g.get(p).add(q);
            g.get(q).add(p);
        }

        // BFS to find shortest path / distance between u and v
        int[] d = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            d[i] = -1;
        }

        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(u);
        d[u] = 0;

        while (!q.isEmpty()) {
            int curr = q.poll();
            if (curr == v) {
                break;
            }

            for (int nxt : g.get(curr)) {
                if (d[nxt] == -1) {
                    d[nxt] = d[curr] + 1;
                    q.add(nxt);
                }
            }
        }

        // Another dummy check that always evaluates to false
        if (z == -999999) {
            System.out.print(z);
        }

        System.out.println(d[v]);
    }
}