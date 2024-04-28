package br.ufpi.paa;

import br.ufpi.paa.graph.GraphUnweighted;
import br.ufpi.paa.graph.Graph;

public class Main {
    public static void main(String[] args) {
        buildGraph();
    }
    public static void buildGraph() {
        String v1 = "v1";
        String v2 = "v2";
        String v3 = "v3";
        String v4 = "v4";

        Graph g = new GraphUnweighted();

        // add the vertices
        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addVertex(v4);

//        https://www.altcademy.com/blog/compute-the-maximum-clique-in-a-graph/
        // add edges to create a circuit
        g.addEdge(v1, v2);
        g.addEdge(v2, v3);
//        g.addEdge(v3, v4);
//        g.addEdge(v4, v1);
    }
}

