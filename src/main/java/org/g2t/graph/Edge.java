package org.g2t.graph;

public class Edge {
    private Vertex originVertex;
    private Vertex destinationVertex;

    public Edge(Vertex originVertex, Vertex destinationVertex) {
        this.originVertex = originVertex;
        this.destinationVertex = destinationVertex;
    }

    public Vertex getOriginVertex() {
        return originVertex;
    }

    public Vertex getDestinationVertex() {
        return destinationVertex;
    }

    @Override
    public String toString() {
        return "("+originVertex.getValue()+ "," + destinationVertex.getValue() +")";
    }
}
