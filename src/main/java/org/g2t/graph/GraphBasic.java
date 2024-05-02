package org.g2t.graph;

import java.util.ArrayList;

public class GraphBasic implements Graph {
    private ArrayList<Vertex> vertices;
    private ArrayList<EdgeBasic> edges;

    public GraphBasic() {
        this.vertices = new ArrayList<>();
        this.edges = new ArrayList<>();
    }

    public ArrayList<Vertex> getVertices() {
        return vertices;
    }

    @Override
    public Vertex addVertex(String vertexValue) {
        if (vertexValue == null || vertexValue.equalsIgnoreCase("")) {
            throw new IllegalArgumentException("Não pode ser nulo e nem vazio");
        }

        for (int i = 0; i < vertices.size(); i++) {
            if(vertices.get(i).getValue().equalsIgnoreCase(vertexValue)){
                return vertices.get(i);
            }
        }


        Vertex candidateVertex = new VertexBasic(vertexValue);
        vertices.add(candidateVertex);

        return candidateVertex;
    }

    private boolean vertexExists(){
        return false;
    }
    @Override
    public Edge addEdge(String originVertex, String destinatioVertex) {
        if (originVertex == null || originVertex.equalsIgnoreCase("")
                ||destinatioVertex == null || destinatioVertex.equalsIgnoreCase("")) {
            throw new IllegalArgumentException("Vértice não pode ser nulo e nem vazio");
        }

        boolean vertexExists = false;
        for (int i = 0; i < vertices.size(); i++) {
            if(vertices.get(i).getValue().equalsIgnoreCase(originVertex)){
                vertexExists = true;
                break;
            }
        }
        if (!vertexExists){
            throw new IllegalArgumentException("originVertex não existe no gráfo");
        }

        vertexExists = false;
        for (int i = 0; i < vertices.size(); i++) {
            if(vertices.get(i).getValue().equalsIgnoreCase(originVertex)){
                vertexExists = true;
                break;
            }
        }
        if (!vertexExists){
            throw new IllegalArgumentException("destinatioVertex não existe no gráfo");
        }

        for (int i = 0; i < edges.size(); i++) {
            if(edges.get(i).getOriginVertex().getValue().equalsIgnoreCase(originVertex)
            && edges.get(i).getDestinationVertex().getValue().equalsIgnoreCase(destinatioVertex)){
                return edges.get(i);
            }
        }

        int originVertexIndex = 0;
        int destinatioVertexIndex = 0;

        for (int i = 0; i < vertices.size(); i++) {
            if(vertices.get(i).getValue().equalsIgnoreCase(originVertex)){
                originVertexIndex = i;
                break;
            }
        }
        for (int i = 0; i < vertices.size(); i++) {
            if(vertices.get(i).getValue().equalsIgnoreCase(destinatioVertex)){
                destinatioVertexIndex = i;
                break;
            }
        }
        EdgeBasic edge = new EdgeBasic(vertices.get(originVertexIndex), vertices.get(destinatioVertexIndex));
        edges.add(edge);

//        Vertex candidateVertex = new VertexBasic(vertexValue);
//        vertices.add(candidateVertex);


        return edge;
    }

/*

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edge> edges) {
        this.edges = edges;
    }
*/

    public void printVertexes(){
        String string = "{";
        for (int i = 0; i < vertices.size(); i++) {
            string = string + vertices.get(i).getValue();
            if (!((i + 1) == vertices.size())) {
                string = string + ", " ;
            }
        }
        string = string + "}";

        System.out.printf(string);
    }
}
