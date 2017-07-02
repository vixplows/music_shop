package music_shop_management;
import behaviours.*;

public class Trumpet extends Instrument implements Playable, Sellable {

  private int numberOfValves;

  public Trumpet(String type, String material, String colour, int numberOfValves, double buyPrice, double sellPrice) {
    super(type, material, colour, buyPrice, sellPrice);
    this.numberOfValves = numberOfValves;
    
  }

}
