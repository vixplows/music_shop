package music_shop_management;
import behaviours.*;

public class MusicStand extends Accessory implements Sellable {

  public MusicStand(String type, double buyPrice, double sellPrice) {
    super(type, buyPrice, sellPrice);
  }

  public String getType() {
    return this.type;
  }

  public double getBuyPrice() {
    return this.buyPrice;
  }

  public double getSellPrice() {
    return this.sellPrice;
  }

  public double calculateMarkUp() {
    double markUp = this.sellPrice - this.buyPrice;
    return markUp;
  }

}