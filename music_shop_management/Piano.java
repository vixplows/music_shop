package music_shop_management;
import behaviours.*;

public class Piano extends Instrument implements Playable, Sellable {

  private int numberOfKeys;

  public Piano(String type, String material, String colour, int numberOfKeys, double buyPrice, double sellPrice) {
    super(type, material, colour, buyPrice, sellPrice);
    this.numberOfKeys = numberOfKeys;
    
  }

}
