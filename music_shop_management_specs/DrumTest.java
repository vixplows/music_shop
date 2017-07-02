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

}