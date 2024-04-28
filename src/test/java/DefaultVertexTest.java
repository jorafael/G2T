import br.ufpi.paa.graph.DefaultVertex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DefaultVertexTest {

    @Test
    public void createVertex(){
        DefaultVertex defaultVertex = new DefaultVertex("V");
        String expectedResult = "V";
        String actualResult = defaultVertex.getValue();

        assertEquals(expectedResult, actualResult, "Deveriam ser iguais");
    }

    @Test
    public void createVertexValueNull() {
        assertThrows(IllegalArgumentException.class, () -> new DefaultVertex(null), "Não pode ser null");
    }

    @Test
    public void createVertexValueEmpty() {
        assertThrows(IllegalArgumentException.class, () -> new DefaultVertex(""), "Não pode ser vazio");
    }
}
