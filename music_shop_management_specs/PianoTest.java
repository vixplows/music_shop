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

}