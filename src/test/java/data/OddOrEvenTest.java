package data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OddOrEvenTest {

    private OddOrEven oddOrEven;

    @BeforeEach
    public void setup() {
        oddOrEven = new OddOrEven();
    }

    @Test
    public void testEvenNumber() {
        assertEquals( "EVEN", oddOrEven.ask(2));

    }
    @Test
    public void testOddNumber() {
        assertEquals( "ODD", oddOrEven.ask(3));
    }

}
