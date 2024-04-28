package br.ufpi.paa.graph;

import java.util.ArrayList;

public class GraphUnweighted implements Graph {
    private ArrayList<Vertex> vertexes;
    private ArrayList<Edge> edges;
    private boolean directed;
    private boolean weighted;

    public GraphUnweighted() {
        this(false, false);
    }

    public GraphUnweighted(boolean directed, boolean weighted) {
        this.vertexes = new ArrayList<>();
        this.edges = new ArrayList<>();
        this.directed = directed;
        this.weighted = weighted;
    }

    public ArrayList<Vertex> getVertexes() {
        return vertexes;
    }

    public void setVertexes(ArrayList<Vertex> vertexes) {
        this.vertexes = vertexes;
    }


    @Override
    public Vertex addVertex(String vertexValue) {
        if (vertexValue == null || vertexValue.equalsIgnoreCase("")) {
            throw new IllegalArgumentException("Não pode ser nulo e nem vazio");
        }

        Vertex candidateVertex = new DefaultVertex(vertexValue);

        if(!vertexes.contains(candidateVertex)){
            vertexes.add(candidateVertex);
        }
        return candidateVertex;
    }

    @Override
    public Edge addEdge(String originVertex, String destinatioVertex) {

        return null;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edge> edges) {
        this.edges = edges;
    }

    public boolean isDirected() {
        return directed;
    }

    public void setDirected(boolean directed) {
        this.directed = directed;
    }

    public boolean isWeighted() {
        return weighted;
    }

    public void setWeighted(boolean weighted) {
        this.weighted = weighted;
    }
}
