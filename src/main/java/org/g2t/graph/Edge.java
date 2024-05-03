package org.g2t.graph;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Edge edge)) return false;
        return originVertex.equals(edge.originVertex) && destinationVertex.equals(edge.destinationVertex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(originVertex, destinationVertex);
    }

    @Override
    public String toString() {
        return "("+originVertex.getValue()+ "," + destinationVertex.getValue() +")";
    }
}
