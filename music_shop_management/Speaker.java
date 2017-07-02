package music_shop_management;
import behaviours.*;

public class Speaker extends Accessory implements Sellable {

  public Speaker(String type, double buyPrice, double sellPrice) {
    super(type, buyPrice, sellPrice);
  }

}