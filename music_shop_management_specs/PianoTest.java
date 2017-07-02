import static org.junit.Assert.*;
import org.junit.*;
import music_shop_management.*;

public class PianoTest {

  Piano piano;

  @Before
  public void before() {
    piano = new Piano("string", "beech", "black", true, 1750.00, 2000.00);
  }

  @Test
  public void hasType() {
    assertEquals("string", piano.getType());
  }

  @Test
  public void hasMaterial() {
    assertEquals("beech", piano.getMaterial());
  }

  @Test
  public void hasColour() {
    assertEquals("black", piano.getColour());
  }

  @Test
  public void knowsIfGrand() {
    assertEquals(true, piano.isGrand());
  }

  @Test
  public void hasBuyPrice() {
    assertEquals(1750.00, piano.getBuyPrice(), .01);
  }

  @Test
  public void hasSellPrice() {
    assertEquals(2000.00, piano.getSellPrice(), .01);
  }

}