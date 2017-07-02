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

}