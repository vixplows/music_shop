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

  public String getMaterial() {
    return this.material;
  }

  public String getColour() {
    return this.colour;
  }

  public String getSize() {
    return this.size;
  }

  public double getBuyPrice() {
    return this.buyPrice;
  }

  public double getSellPrice() {
    return this.sellPrice;
  }

  public String play() {
    return "Deep sounds";
  }
  

}
