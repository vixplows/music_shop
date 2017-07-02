package music_shop_management;
import behaviours.*;

public class Piano extends Instrument implements Playable, Sellable {

  private boolean grand;

  public Piano(String type, String material, String colour, boolean grand, double buyPrice, double sellPrice) {
    super(type, material, colour, buyPrice, sellPrice);
    this.grand = grand;
    
  }

  public String getType() {
    return this.type;
  }
  
}
