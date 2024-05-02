package org.g2t;

import org.g2t.graph.Graph;
import org.g2t.graph.GraphBasic;

public class Main {
    public static void main(String[] args) {
        buildGraph();
    }
    public static void buildGraph() {
        String v1 = "v1";
        String v2 = "v2";
        String v3 = "v3";
        String v4 = "v4";

        GraphBasic g = new GraphBasic();

        // add the vertices
        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addVertex(v4);

        g.printVertexes();

//        https://www.altcademy.com/blog/compute-the-maximum-clique-in-a-graph/
        // add edges to create a circuit
//        g.addEdge(v1, v2);
//        g.addEdge(v2, v3);
//        g.addEdge(v3, v4);
//        g.addEdge(v4, v1);
    }
}

