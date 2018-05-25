import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Fender", "FireBirst", "Guitar", 300.00, 500);
    }

    @Test
    public void hasName(){
        assertEquals("Fender",Guitar.getName());
    }
}
