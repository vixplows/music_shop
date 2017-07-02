package music_shop_management;
import behaviours.*;

public class Drum extends Instrument implements Playable, Sellable {

  private int drumHead;

  public Drum(InstrumentType type, String material, String colour, int drumHead, double buyPrice, double sellPrice) {
    super(type, material, colour, buyPrice, sellPrice);
    this.drumHead = drumHead;
    
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

  public int getDrumHead() {
    return this.drumHead;
  }

  public double getBuyPrice() {
    return this.buyPrice;
  }

  public double getSellPrice() {
    return this.sellPrice;
  }

  public String play() {
    return "Beat it";
  }

  public double calculateMarkUp() {
    double markUp = this.sellPrice - this.buyPrice;
    return markUp;
  }

}
