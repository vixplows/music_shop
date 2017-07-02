import static org.junit.Assert.*;
import org.junit.*;
import music_shop_management.*;

public class DrumTest {

  Drum drum;

  @Before
  public void before() {
    drum = new Drum("percussion", "skin", "red", 2, 200.00, 250.00);
  }

  @Test
  public void hasType() {
    assertEquals("percussion", drum.getType());
  }


  @Test
  public void hasMaterial() {
    assertEquals("skin", drum.getMaterial());
  }

  @Test
  public void hasColour() {
    assertEquals("red", drum.getColour());
  }

  @Test
  public void hasDrumHeadNumber() {
    assertEquals(2, drum.getDrumHead());
  }

  @Test
  public void hasBuyPrice() {
    assertEquals(200.00, drum.getBuyPrice(), .01);
  }

  @Test
  public void hasSellPrice() {
    assertEquals(250.00, drum.getSellPrice(), .01);
  }

}