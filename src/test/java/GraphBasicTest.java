import org.g2t.graph.GraphBasic;
import org.g2t.graph.Vertex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GraphBasicTest {

    @Test
    public void verifyNumberOfVertexesWhenCreateGraph(){
        GraphBasic GraphBasic = new GraphBasic();
        int expectedResult = 0;
        int actualResult =  GraphBasic.getVertices().size();

        assertEquals(expectedResult, actualResult, "Deveriam ser iguais");
    }

    @Test
    public void verifyNumberOfEdgesWhenCreateGraph(){
        GraphBasic GraphBasic = new GraphBasic();
        int expectedResult = 0;
        int actualResult =  GraphBasic.getEdges().size();

        assertEquals(expectedResult, actualResult, "Deveriam ser iguais");
    }

    @Test
    public void createAnyVertex(){
        GraphBasic GraphBasic = new GraphBasic();
        Vertex defaultVertex = GraphBasic.addVertex("V");
        String expectedResult = "V";

        String actualResult =  defaultVertex.getValue();

        assertEquals(expectedResult, actualResult, "Deveriam ser iguais");
    }

    @Test
    public void createVertexWithGraphEmpty(){
        GraphBasic GraphBasic = new GraphBasic();
        GraphBasic.addVertex("V");

        int expectedResult = 1;
        int actualResult = GraphBasic.getVertices().size();

        assertEquals(expectedResult, actualResult, "Deveriam ser iguais");
    }

    @Test
    public void createVertexThatExistisAtGraph(){
        GraphBasic GraphBasic = new GraphBasic();
        Vertex vertex1 = GraphBasic.addVertex("V");

        String expectedResult = vertex1.getValue();

        Vertex vertex2 = GraphBasic.addVertex("V");
        String actualResult = vertex2.getValue();

        assertEquals(expectedResult, actualResult, "Deveriam ser iguais");
    }

    @Test
    public void verifyNumberOfVertexesWhenCreateVertexThatExistisAtGraph(){
        GraphBasic GraphBasic = new GraphBasic();
        GraphBasic.addVertex("V");
        GraphBasic.addVertex("V");

        boolean actualResult = (GraphBasic.getVertices().size() == 1 && GraphBasic.getVertices().get(0).getValue().equals("V"));

        assertTrue(actualResult, "Deveriam ser iguais");
    }

    @Test
    public void createVertexThatNotExistisAtGraph(){
        GraphBasic GraphBasic = new GraphBasic();
        GraphBasic.addVertex("V");

        String expectedResult = "A";

        Vertex newVertex = GraphBasic.addVertex("A");
        String actualResult = newVertex.getValue();;

        assertEquals(expectedResult, actualResult, "Deveriam ser iguais");
    }

    @Test
    public void verifyNumberOfVertexesWhenCreateVertexThatNotExistisAtGraph(){
        GraphBasic GraphBasic = new GraphBasic();
        GraphBasic.addVertex("V");

        Integer expectedResult = 2;

        GraphBasic.addVertex("A");
        Integer actualResult = GraphBasic.getVertices().size();

        assertEquals(expectedResult, actualResult, "Deveriam ser iguais");
    }

    @Test
    public void createVertexValueNull() {
        GraphBasic GraphBasic = new GraphBasic();
        assertThrows(IllegalArgumentException.class, () -> GraphBasic.addVertex(null), "Não pode ser nulo e nem vazio");
    }

    @Test
    public void createVertexValueEmpty() {
        GraphBasic GraphBasic = new GraphBasic();
        assertThrows(IllegalArgumentException.class, () -> GraphBasic.addVertex(null), "Não pode ser nulo e nem vazio");
    }
}
