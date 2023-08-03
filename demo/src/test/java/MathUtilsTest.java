import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.MathUtils;

public class MathUtilsTest {
    @Test
    public void testSquare() {
        int result = MathUtils.square(5);
        assertEquals(25, result);
    }
}
