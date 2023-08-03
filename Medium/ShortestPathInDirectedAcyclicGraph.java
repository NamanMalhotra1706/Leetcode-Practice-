import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestPathInDirectedAcyclicGraph {
     static class Node {
        int vertex;
        int distance;

        Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }
    }

    public int[] shortestPath(int N, int M, int[][] edges) {
        List<List<Node>> graph = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];
            graph.get(u).add(new Node(v, weight));
        }

        int[] distance = new int[N];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[0] = 0;

        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0, 0));

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            int u = current.vertex;
            int distU = current.distance;

            if (distU > distance[u]) {
                continue;
            }

            for (Node neighbor : graph.get(u)) {
                int v = neighbor.vertex;
                int weightUV = neighbor.distance;

                if (distU + weightUV < distance[v]) {
                    distance[v] = distU + weightUV;
                    queue.add(new Node(v, distance[v]));
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (distance[i] == Integer.MAX_VALUE) {
                distance[i] = -1;
            }
        }

        return distance;
    }
    public static void main(String[] args) {
        
    }
}
