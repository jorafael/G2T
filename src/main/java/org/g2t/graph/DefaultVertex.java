package br.ufpi.paa.graph;

import java.util.ArrayList;
import java.util.Objects;

public class DefaultVertex implements Vertex{
    private String value;
    private ArrayList<Edge> edges;

    public DefaultVertex(String value) {
        setValue(value);
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        if (value == null || value.equalsIgnoreCase("")) {
            throw new IllegalArgumentException("value não pode ser nulo e nem vazio");
        }
        this.value = value;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edge> edges) {
        this.edges = edges;
    }

//    public void addEdge(String)

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DefaultVertex that = (DefaultVertex) o;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
