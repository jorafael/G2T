import org.g2t.graph.VertexBasic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VertexBasicTest {

    @Test
    public void createVertex(){
        VertexBasic VertexBasic = new VertexBasic("V");
        String expectedResult = "V";
        String actualResult = VertexBasic.getValue();

        assertEquals(expectedResult, actualResult, "Deveriam ser iguais");
    }

    @Test
    public void createVertexValueNull() {
        assertThrows(IllegalArgumentException.class, () -> new VertexBasic(null), "Não pode ser null");
    }

    @Test
    public void createVertexValueEmpty() {
        assertThrows(IllegalArgumentException.class, () -> new VertexBasic(""), "Não pode ser vazio");
    }
}
