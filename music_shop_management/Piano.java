package music_shop_management;
import behaviours.*;

public class Piano extends Instrument implements Playable, Sellable {

  private boolean grand;

  public Piano(InstrumentType type, String material, String colour, boolean grand, double buyPrice, double sellPrice) {
    super(type, material, colour, buyPrice, sellPrice);
    this.grand = grand;
    
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

  public boolean isGrand() {
    return this.grand;
  }

  public double getBuyPrice() {
    return this.buyPrice;
  }

  public double getSellPrice() {
    return this.sellPrice;
  }

  public String play() {
    return "Tinkle, tinkle, melody";
  }

  public double calculateMarkUp() {
    double markUp = this.sellPrice - this.buyPrice;
    return markUp;
  }
  
}
