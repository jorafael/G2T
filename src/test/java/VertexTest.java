import org.g2t.graph.Vertex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VertexTest {

    @Test
    public void createVertex(){
        Vertex Vertex = new Vertex("V");
        String expectedResult = "V";
        String actualResult = Vertex.getValue();

        assertEquals(expectedResult, actualResult, "Deveriam ser iguais");
    }

    @Test
    public void createVertexValueNull() {
        assertThrows(IllegalArgumentException.class, () -> new Vertex(null), "Não pode ser null");
    }

    @Test
    public void createVertexValueEmpty() {
        assertThrows(IllegalArgumentException.class, () -> new Vertex(""), "Não pode ser vazio");
    }
}
