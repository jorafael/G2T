package br.ufpi.paa.graph;

public interface Graph {
    public Vertex addVertex(String vertex);
    public Edge addEdge(String originVertex, String destinatioVertex);
}