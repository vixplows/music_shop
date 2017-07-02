import static org.junit.Assert.*;
import org.junit.*;
import music_shop_management.*;

public class MusicStandTest {

  MusicStand musicStand;

  @Before
  public void before() {
    musicStand = new MusicStand("orchestral", 8.50, 10.00);
  }

  @Test
  public void hasType() {
    assertEquals("orchestral", musicStand.getType());
  }

  @Test
  public void hasBuyPrice() {
    assertEquals(8.50, musicStand.getBuyPrice(), .01);
  }

  @Test
  public void hasSellPrice() {
    assertEquals(10.00, musicStand.getSellPrice(), .01);
  }

  @Test
  public void canCalculateMarkUp() {
    assertEquals(1.50, musicStand.calculateMarkUp(), 01);
  }

}