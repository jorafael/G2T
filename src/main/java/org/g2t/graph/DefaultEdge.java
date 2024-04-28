package br.ufpi.paa.graph;

public class DefaultEdge implements Edge{
    private Vertex originVertex;
    private Vertex destinationVertex;
    private Integer weight;

    public DefaultEdge(Vertex originVertex, Vertex destinationVertex) {
        this(originVertex, destinationVertex, null);
    }

    public DefaultEdge(Vertex originVertex, Vertex destinationVertex, Integer weight) {
        this.originVertex = originVertex;
        this.destinationVertex = destinationVertex;
        this.weight = weight;
    }

    public Vertex getOriginVertex() {
        return originVertex;
    }

    public Vertex getDestinationVertex() {
        return destinationVertex;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setDestinationVertex(Vertex defaultVertex2) {
        this.destinationVertex = defaultVertex2;
    }

/*    @Override
    public <T> void addVertex(T vertex) {

    }*/
}
