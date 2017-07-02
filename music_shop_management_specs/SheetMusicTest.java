import static org.junit.Assert.*;
import org.junit.*;
import music_shop_management.*;

public class SheetMusicTest {

  SheetMusic sheetMusic;

  @Before
  public void before() {
    sheetMusic = new SheetMusic("print", 12.00, 13.00);
  }

  @Test
  public void hasType() {
    assertEquals("print", sheetMusic.getType());
  }

  @Test
  public void hasBuyPrice() {
    assertEquals(12.00, sheetMusic.getBuyPrice(), .01);
  }

  @Test
  public void hasSellPrice() {
    assertEquals(13.00, sheetMusic.getSellPrice(), .01);
  }

  @Test
  public void canCalculateMarkUp() {
    assertEquals(1.00, sheetMusic.calculateMarkUp(), 01);
  }

}