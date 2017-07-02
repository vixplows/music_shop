package music_shop_management;
import behaviours.*;

public class SheetMusic extends Accessory implements Sellable {

  public SheetMusic(String type, double buyPrice, double sellPrice) {
    super(type, buyPrice, sellPrice);
  }

}