package music_shop_management;

public abstract class Instrument {

  protected InstrumentType type;
  protected String material;
  protected String colour;
  protected double buyPrice;
  protected double sellPrice;

  public Instrument(InstrumentType type, String material, String colour, double buyPrice, double sellPrice) {
    this.type = type;
    this.material = material;
    this.colour = colour;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
  }

}