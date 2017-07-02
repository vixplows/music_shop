import static org.junit.Assert.*;
import org.junit.*;
import music_shop_management.*;

public class CelloTest {

  Cello cello;

  @Before
  public void before() {
    cello = new Cello("string", "wood", "brown", "full", 600.00, 699.99);
  }

  @Test
  public void hasType() {
    assertEquals("string", cello.getType());
  }


  @Test
  public void hasMaterial() {
    assertEquals("wood", cello.getMaterial());
  }

  @Test
  public void hasColour() {
    assertEquals("brown", cello.getColour());
  }

  @Test
  public void hasSize() {
    assertEquals("full", cello.getSize());
  }

  @Test
  public void hasBuyPrice() {
    assertEquals(600.00, cello.getBuyPrice(), .01);
  }

  @Test
  public void hasSellPrice() {
    assertEquals(699.99, cello.getSellPrice(), .01);
  }

}