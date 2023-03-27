import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalc {
    @Test
    public void testSum1() {
        Assertions.assertEquals(1, SumCalculator.sum(1));
    }

    @Test
    public void testSum3() {
        Assertions.assertEquals(6, SumCalculator.sum(3));
    }

    @BeforeEach
    @Test
    public void testSum0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> SumCalculator.sum(0));
    }
}
