package pe.prob;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class P001Test {
    @Test
    public void test_aop_001() {
        assertEquals(233168, new P001().aop());
    }
}
