package music_shop_management;
import behaviours.*;

public class Flute extends Instrument implements Playable, Sellable {

  private String variant;

  public Flute(String type, String material, String colour, String variant, double buyPrice, double sellPrice) {
    super(type, material, colour, buyPrice, sellPrice);
    this.variant = variant;
    
  }

}
