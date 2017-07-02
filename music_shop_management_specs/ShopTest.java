import static org.junit.Assert.*;
import org.junit.*;
import music_shop_management.*;
import behaviours.*;

public class ShopTest {

  private Shop shop;
  private Sellable cello;
  private Sellable drum;
  private Sellable flute;
  private Sellable guitar;
  private Sellable musicStand;
  private Sellable piano;
  private Sellable sheetMusic;
  private Sellable speaker;

  @Before
  public void before() {
    shop = new Shop("Ray's Music Exchange");
    cello = new Cello("string", "wood", "brown", "full", 600.00, 699.99);
    drum = new Drum("percussion", "skin", "red", 2, 200.00, 250.00);
    flute = new Flute("woodwind", "metal", "gold", "western", 100.00, 125.00);
    guitar = new Guitar("string", "plastic", "green", 500.00, 600.50);
    musicStand = new MusicStand("orchestral", 8.50, 10.00);
    piano = new Piano("string", "beech", "black", true, 1750.00, 2000.00);
    sheetMusic = new SheetMusic("print", 12.00, 13.00);
    speaker = new Speaker("audio", 20.00, 25.00);
  }

  @Test
  public void hasName() {
    assertEquals("Ray's Music Exchange", shop.getName());
  }

  @Test
  public void canStockStartsEmpty() {
    assertEquals(0, shop.countStock());
  }

  @Test
  public void canAddStock() {
    shop.addStock(cello);
    assertEquals(1, shop.countStock());
  }

  @Test
  public void canRemoveStock() {
    shop.addStock(cello);
    shop.removeStock(cello);
    assertEquals(0, shop.countStock());
  }

  @Test
  public void canGetTotalPotentialProfit () {
    shop.addStock(cello);
    shop.addStock(drum);
    shop.addStock(flute);
    shop.addStock(guitar);
    shop.addStock(musicStand);
    shop.addStock(piano);
    shop.addStock(sheetMusic);
    shop.addStock(speaker);
    assertEquals(532.99, shop.getTotalPotentialProfit(), .01);
  }
}