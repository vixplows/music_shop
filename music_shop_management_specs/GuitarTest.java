import static org.junit.Assert.*;
import org.junit.*;
import music_shop_management.*;

public class GuitarTest {

  Guitar guitar;

  @Before
  public void before() {
    guitar = new Guitar("string", "plastic", "green", 500.00, 600.50);
  }

  @Test
  public void hasType() {
    assertEquals("string", guitar.getType());
  }

  @Test
  public void hasMaterial() {
    assertEquals("plastic", guitar.getMaterial());
  }

  @Test
  public void hasColour() {
    assertEquals("green", guitar.getColour());
  }

  @Test
  public void hasBuyPrice() {
    assertEquals(500.00, guitar.getBuyPrice(), .01);
  }

  @Test
  public void hasSellPrice() {
    assertEquals(600.50, guitar.getSellPrice(), .01);
  }

  @Test
  public void hasPlaySound() {
    assertEquals("Guitar, guitar", guitar.play());
  }

  @Test
  public void canCalculateMarkUp() {
    assertEquals(100.50, guitar.calculateMarkUp(), 01);
  }

}