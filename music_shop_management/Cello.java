package music_shop_management;
import behaviours.*;

public class Cello extends Instrument implements Playable, Sellable {

  private double size;

  public Cello(String type, String material, String colour, double size, double buyPrice, double sellPrice) {
    super(type, material, colour, buyPrice, sellPrice);
    this.size = size;
  }

}
