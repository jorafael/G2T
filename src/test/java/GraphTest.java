import org.g2t.graph.Graph;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GraphTest {

    @Test
    public void verifyNumberOfVertexesWhenCreateGraph(){
        Graph Graph = new Graph();
        int expectedResult = 0;
        int actualResult =  Graph.getVertices().size();

        assertEquals(expectedResult, actualResult, "Deveriam ser iguais");
    }

    @Test
    public void verifyNumberOfEdgesWhenCreateGraph(){
        Graph Graph = new Graph();
        int expectedResult = 0;
//        int actualResult =  Graph.getEdges().size();

//        assertEquals(expectedResult, actualResult, "Deveriam ser iguais");
    }

    @Test
    public void createAnyVertex(){
/*        Graph Graph = new Graph();
        Vertex defaultVertex = Graph.addVertex("V");
        String expectedResult = "V";

        String actualResult =  defaultVertex.getValue();

        assertEquals(expectedResult, actualResult, "Deveriam ser iguais");*/
    }

    @Test
    public void createVertexWithGraphEmpty(){
        Graph Graph = new Graph();
        Graph.addVertex("V");

        int expectedResult = 1;
        int actualResult = Graph.getVertices().size();

        assertEquals(expectedResult, actualResult, "Deveriam ser iguais");
    }

    @Test
    public void createVertexThatExistisAtGraph(){
/*        Graph Graph = new Graph();
        Vertex vertex1 = Graph.addVertex("V");

        String expectedResult = vertex1.getValue();

        Vertex vertex2 = Graph.addVertex("V");
        String actualResult = vertex2.getValue();

        assertEquals(expectedResult, actualResult, "Deveriam ser iguais");*/
    }

    @Test
    public void verifyNumberOfVertexesWhenCreateVertexThatExistisAtGraph(){
        Graph Graph = new Graph();
        Graph.addVertex("V");
        Graph.addVertex("V");

        boolean actualResult = (Graph.getVertices().size() == 1 && Graph.getVertices().get(0).getValue().equals("V"));

        assertTrue(actualResult, "Deveriam ser iguais");
    }

    @Test
    public void createVertexThatNotExistisAtGraph(){
/*        Graph Graph = new Graph();
        Graph.addVertex("V");

        String expectedResult = "A";

        Vertex newVertex = Graph.addVertex("A");
        String actualResult = newVertex.getValue();;

        assertEquals(expectedResult, actualResult, "Deveriam ser iguais");*/
    }

    @Test
    public void verifyNumberOfVertexesWhenCreateVertexThatNotExistisAtGraph(){
        Graph Graph = new Graph();
        Graph.addVertex("V");

        Integer expectedResult = 2;

        Graph.addVertex("A");
        Integer actualResult = Graph.getVertices().size();

        assertEquals(expectedResult, actualResult, "Deveriam ser iguais");
    }

    @Test
    public void createVertexValueNull() {
        Graph Graph = new Graph();
        assertThrows(IllegalArgumentException.class, () -> Graph.addVertex(null), "Não pode ser nulo e nem vazio");
    }

    @Test
    public void createVertexValueEmpty() {
        Graph Graph = new Graph();
        assertThrows(IllegalArgumentException.class, () -> Graph.addVertex(null), "Não pode ser nulo e nem vazio");
    }
}
