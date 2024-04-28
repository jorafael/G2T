import br.ufpi.paa.graph.GraphUnweighted;
import br.ufpi.paa.graph.Vertex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GraphUnweightedTest {

    @Test
    public void verifyNumberOfVertexesWhenCreateGraph(){
        GraphUnweighted graphUnweighted = new GraphUnweighted();
        int expectedResult = 0;
        int actualResult =  graphUnweighted.getVertexes().size();

        assertEquals(expectedResult, actualResult, "Deveriam ser iguais");
    }

    @Test
    public void verifyNumberOfEdgesWhenCreateGraph(){
        GraphUnweighted graphUnweighted = new GraphUnweighted();
        int expectedResult = 0;
        int actualResult =  graphUnweighted.getEdges().size();

        assertEquals(expectedResult, actualResult, "Deveriam ser iguais");
    }

    @Test
    public void createAnyVertex(){
        GraphUnweighted graphUnweighted = new GraphUnweighted();
        Vertex defaultVertex = graphUnweighted.addVertex("V");
        String expectedResult = "V";

        String actualResult =  defaultVertex.getValue();

        assertEquals(expectedResult, actualResult, "Deveriam ser iguais");
    }

    @Test
    public void createVertexWithGraphEmpty(){
        GraphUnweighted graphUnweighted = new GraphUnweighted();
        graphUnweighted.addVertex("V");

        int expectedResult = 1;
        int actualResult = graphUnweighted.getVertexes().size();

        assertEquals(expectedResult, actualResult, "Deveriam ser iguais");
    }

    @Test
    public void createVertexThatExistisAtGraph(){
        GraphUnweighted graphUnweighted = new GraphUnweighted();
        Vertex vertex1 = graphUnweighted.addVertex("V");

        String expectedResult = vertex1.getValue();

        Vertex vertex2 = graphUnweighted.addVertex("V");
        String actualResult = vertex2.getValue();

        assertEquals(expectedResult, actualResult, "Deveriam ser iguais");
    }

    @Test
    public void verifyNumberOfVertexesWhenCreateVertexThatExistisAtGraph(){
        GraphUnweighted graphUnweighted = new GraphUnweighted();
        graphUnweighted.addVertex("V");
        graphUnweighted.addVertex("V");

        boolean actualResult = (graphUnweighted.getVertexes().size() == 1 && graphUnweighted.getVertexes().get(0).getValue().equals("V"));

        assertTrue(actualResult, "Deveriam ser iguais");
    }

    @Test
    public void createVertexThatNotExistisAtGraph(){
        GraphUnweighted graphUnweighted = new GraphUnweighted();
        graphUnweighted.addVertex("V");

        String expectedResult = "A";

        Vertex newVertex = graphUnweighted.addVertex("A");
        String actualResult = newVertex.getValue();;

        assertEquals(expectedResult, actualResult, "Deveriam ser iguais");
    }

    @Test
    public void verifyNumberOfVertexesWhenCreateVertexThatNotExistisAtGraph(){
        GraphUnweighted graphUnweighted = new GraphUnweighted();
        graphUnweighted.addVertex("V");

        Integer expectedResult = 2;

        graphUnweighted.addVertex("A");
        Integer actualResult = graphUnweighted.getVertexes().size();

        assertEquals(expectedResult, actualResult, "Deveriam ser iguais");
    }

    @Test
    public void createVertexValueNull() {
        GraphUnweighted graphUnweighted = new GraphUnweighted();
        assertThrows(IllegalArgumentException.class, () -> graphUnweighted.addVertex(null), "Não pode ser nulo e nem vazio");
    }

    @Test
    public void createVertexValueEmpty() {
        GraphUnweighted graphUnweighted = new GraphUnweighted();
        assertThrows(IllegalArgumentException.class, () -> graphUnweighted.addVertex(null), "Não pode ser nulo e nem vazio");
    }
}
