package music_shop_management;
import behaviours.*;

public class Guitar extends Instrument implements Playable, Sellable {

  public Guitar(InstrumentType type, String material, String colour, double buyPrice, double sellPrice) {
    super(type, material, colour, buyPrice, sellPrice);
    
  }

  public InstrumentType getType() {
    return this.type;
  }

  public String getMaterial() {
    return this.material;
  }

  public String getColour() {
    return this.colour;
  }

  public double getBuyPrice() {
    return this.buyPrice;
  }

  public double getSellPrice() {
    return this.sellPrice;
  }

  public String play() {
    return "Guitar, guitar";
  }

  public double calculateMarkUp() {
    double markUp = this.sellPrice - this.buyPrice;
    return markUp;
  }

}
