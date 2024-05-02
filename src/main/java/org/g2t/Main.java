package org.g2t;

import org.g2t.graph.Graph;

public class Main {
    public static void main(String[] args) {
        buildGraphExample();
    }
    public static Graph buildGraphExample() {
        String[] vertices = new String[]{"A", "B", "C", "D", "E", "F", "G", "H"};

        String arestas[][] = new String[][]{
                {"A", "B"}, {"A", "C"}, {"A", "D"}, {"B", "C"}, {"B", "D"}, {"B", "E"},
                {"C", "D"}, {"D", "E"}, {"E", "F"}, {"F", "G"}, {"F", "H"}, {"G", "H"}
        };
        Graph graph = new Graph();

        graph.addVerticesFromArray(vertices);
        graph.addEdgesFromArray(arestas);
        graph.printVertices();
        graph.printEdges();
        graph.printVerticesWithNeighborhoods();

        return graph;
    }

    public static void cliqueRun(Graph graph){

    }
}

