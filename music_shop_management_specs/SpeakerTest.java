import static org.junit.Assert.*;
import org.junit.*;
import music_shop_management.*;

public class SpeakerTest {

  Speaker speaker;

  @Before
  public void before() {
    speaker = new Speaker("audio", 20.00, 25.00);
  }

  @Test
  public void hasType() {
    assertEquals("audio", speaker.getType());
  }

  @Test
  public void hasBuyPrice() {
    assertEquals(20.00, speaker.getBuyPrice(), .01);
  }

  @Test
  public void hasSellPrice() {
    assertEquals(25.00, speaker.getSellPrice(), .01);
  }


}