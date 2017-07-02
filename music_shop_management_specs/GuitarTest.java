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

}