import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Fender", "FireBurst", "Guitar", 300.00, 500);
    }

    @Test
    public void hasModel(){
        assertEquals("Fender",guitar.getModel());
    }

    @Test
    public void hasColour(){
        assertEquals("FireBurst", guitar.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("Guitar", guitar.getType());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(300.00, guitar.getBuyPrice(),0.1);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(500.00, guitar.getSellPrice(),0.1);
    }
}
