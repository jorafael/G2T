package org.g2t.graph;

import java.util.ArrayList;
import java.util.Objects;

public class Vertex {
    private String value;
    private ArrayList<Edge> edges;

    public Vertex(String value) {
        setValue(value);
        edges = new ArrayList<>();
    }

    public String getValue() {
        return value;
    }

    private void setValue(String value) {
        if (value == null || value.equalsIgnoreCase("")) {
            throw new IllegalArgumentException("value não pode ser nulo e nem vazio");
        }
        this.value = value;
    }

    public Edge addEdge(Vertex destination) {

        this.edges.add(new Edge(this, destination));
        return null;
    }
    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public ArrayList<String> getNeighborhoods(){
        ArrayList<String> neighborhoos = new ArrayList<>();
        for (int i = 0; i < edges.size(); i++) {
            neighborhoos.add(edges.get(i).getDestinationVertex().getValue());
        }
        return neighborhoos;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex that = (Vertex) o;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
