package org.g2t.graph;

public class EdgeBasic implements Edge{
    private Vertex originVertex;
    private Vertex destinationVertex;

    public EdgeBasic(Vertex originVertex, Vertex destinationVertex) {
        this.originVertex = originVertex;
        this.destinationVertex = destinationVertex;
    }

    public Vertex getOriginVertex() {
        return originVertex;
    }

    public Vertex getDestinationVertex() {
        return destinationVertex;
    }

    public void setDestinationVertex(Vertex defaultVertex2) {
        this.destinationVertex = defaultVertex2;
    }

/*    @Override
    public <T> void addVertex(T vertex) {

    }*/
}
