import static org.junit.Assert.*;
import org.junit.*;
import music_shop_management.*;

public class FluteTest {

  Flute flute;

  @Before
  public void before() {
    flute = new Flute("woodwind", "metal", "gold", "western", 100.00, 125.00);
  }

  @Test
  public void hasType() {
    assertEquals("woodwind", flute.getType());
  }


  @Test
  public void hasMaterial() {
    assertEquals("metal", flute.getMaterial());
  }

  @Test
  public void hasColour() {
    assertEquals("gold", flute.getColour());
  }

  @Test
  public void hasVariant() {
    assertEquals("western", flute.getVariant());
  }

  @Test
  public void hasBuyPrice() {
    assertEquals(100.00, flute.getBuyPrice(), .01);
  }

  @Test
  public void hasSellPrice() {
    assertEquals(125.00, flute.getSellPrice(), .01);
  }


  @Test
  public void hasPlaySound() {
    assertEquals("Soft and sweet", flute.play());
  }

  @Test
  public void canCalculateMarkUp() {
    assertEquals(25.00, flute.calculateMarkUp(), 01);
  }

}