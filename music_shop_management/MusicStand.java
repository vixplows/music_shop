package music_shop_management;
import behaviours.*;

public class MusicStand extends Accessory implements Sellable {

  public MusicStand(String type, double buyPrice, double sellPrice) {
    super(type, buyPrice, sellPrice);
  }

}