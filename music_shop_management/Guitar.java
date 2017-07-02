package music_shop_management;
import behaviours.*;

public class Guitar extends Instrument implements Playable, Sellable {

  public Guitar(String type, String material, String colour, double buyPrice, double sellPrice) {
    super(type, material, colour, buyPrice, sellPrice);
    
  }

}
