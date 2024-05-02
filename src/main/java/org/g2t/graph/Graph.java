package org.g2t.graph;

import java.util.ArrayList;

public class Graph {
    private ArrayList<Vertex> vertices;
    private ArrayList<Edge> edges;

    public Graph() {
        this.vertices = new ArrayList<>();
        this.edges = new ArrayList<>();
    }

    public ArrayList<Vertex> getVertices() {
        return vertices;
    }

    private int hasVertex(String value) {
        for (int i = 0; i < vertices.size(); i++) {
            if (vertices.get(i).getValue().equalsIgnoreCase(value)) {
                return i;
            }
        }
        return -1;
    }

    public Vertex addVertex(String value) {
        if (value == null || value.equalsIgnoreCase("")) {
            throw new IllegalArgumentException("Não pode ser nulo e nem vazio");
        }

        int index = hasVertex(value);
        if (index >= 0) {
            return vertices.get(index);
        } else {
            Vertex vertex = new Vertex(value);
            vertices.add(vertex);
            return vertex;
        }
    }

    public void addVerticesFromArray(String[] verticesString) {
        for (int i = 0; i < verticesString.length; i++) {
            addVertex(verticesString[i]);
        }
    }

    public void addEdgesFromArray(String[][] edgesString) {
        for (int i = 0; i < edgesString.length; i++) {
            addEdge(edgesString[i][0], edgesString[i][1]);
        }
    }

    public Edge addEdge(String originVertex, String destinatioVertex) {
        if (originVertex == null || originVertex.equalsIgnoreCase("")
                || destinatioVertex == null || destinatioVertex.equalsIgnoreCase("")) {
            throw new IllegalArgumentException("Vértice não pode ser nulo e nem vazio");
        }

        int originVertexIndex = hasVertex(originVertex);
        int destinatioVertexIndex = hasVertex(destinatioVertex);

        if (originVertexIndex == -1) {
            throw new IllegalArgumentException(originVertex + " não existe no gráfo");
        }
        if (destinatioVertexIndex == -1) {
            throw new IllegalArgumentException(destinatioVertex + " não existe no gráfo");
        }

        // Verifica se existe aresta com estes vértices
        for (int i = 0; i < edges.size(); i++) {
            if ((edges.get(i).getOriginVertex().getValue().equalsIgnoreCase(originVertex)
                    && edges.get(i).getDestinationVertex().getValue().equalsIgnoreCase(destinatioVertex))
                || (edges.get(i).getOriginVertex().getValue().equalsIgnoreCase(destinatioVertex)
                    && edges.get(i).getDestinationVertex().getValue().equalsIgnoreCase(originVertex))
            ){
                return edges.get(i);
            }
        }

        // Cria se não houver aresta
        Edge edge = new Edge(vertices.get(originVertexIndex), vertices.get(destinatioVertexIndex));
        edges.add(edge);

        vertices.get(originVertexIndex).addEdge(vertices.get(destinatioVertexIndex));
        vertices.get(destinatioVertexIndex).addEdge(vertices.get(originVertexIndex));

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

    public void printVertices() {
        String string = "{";
        for (int i = 0; i < vertices.size(); i++) {
            string = string + vertices.get(i).getValue() + ((i+1)==vertices.size() ? "" : ", " );
        }
        string = string + "}";

        System.out.println(string);
    }

    public void printVerticesWithNeighborhoods() {
        String string = "";
        for (int i = 0; i < vertices.size(); i++) {
            string = string + vertices.get(i).getValue() +": {";
            ArrayList<String> neighborhoods = vertices.get(i).getNeighborhoods();

            for (int j = 0; j < neighborhoods.size(); j++) {
                string = string + neighborhoods.get(j) + ((j + 1) == neighborhoods.size() ? "" : ", ");
            }
            string = string + "}\n";
        }
//        string = string + "}";

        System.out.println(string);
    }

    public void printEdges(){
        String string = "{";
        for (int i = 0; i < edges.size(); i++) {
            string = string + edges.get(i) + ((i+1)== edges.size() ? "" : ", ");
        }
        string = string + "}";
        System.out.println(string);
    }
}
