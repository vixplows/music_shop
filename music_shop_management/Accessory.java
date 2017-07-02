package music_shop_management;

public abstract class Accessory {

  protected String type;
  protected double buyPrice;
  protected double sellPrice;

  public Accessory(String type, double buyPrice, double sellPrice) {
    this.type = type;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
  }

}