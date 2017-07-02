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

}