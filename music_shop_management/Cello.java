package music_shop_management;
import behaviours.*;

public class Cello extends Instrument implements Playable, Sellable {

  private String size;

  public Cello(String type, String material, String colour, String size, double buyPrice, double sellPrice) {
    super(type, material, colour, buyPrice, sellPrice);
    this.size = size;
  }

  public String getType() {
    return this.type;
  }

}
