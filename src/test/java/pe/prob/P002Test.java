package pe.prob;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class P002Test {
    @Test
    public void test_aop_002() {
        assertEquals(4613732, new P002().aop());
    }
}
