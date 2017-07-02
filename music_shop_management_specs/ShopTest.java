import static org.junit.Assert.*;
import org.junit.*;
import music_shop_management.*;
import behaviours.*;

public class ShopTest {

  private Shop shop;
  private Sellable cello;
  private Sellable drum;
  private Sellable sheetMusic;

  @Before
  public void before() {
    shop = new Shop("Ray's Music Exchange");
    cello = new Cello("string", "wood", "brown", "full", 600.00, 699.99);
    drum = new Drum("percussion", "skin", "red", 2, 200.00, 250.00);
    sheetMusic = new SheetMusic("print", 12.00, 13.00);
  }

  @Test
  public void hasName() {
    assertEquals("Ray's Music Exchange", shop.getName());
  }

  @Test
  public void canStockStartsEmpty() {
    assertEquals(0, shop.countStock());
  }

  // @Test
  // public void canAddStock() {
  //   shop.addStock(cello);
  //   assertEquals(1, )
  // }

}