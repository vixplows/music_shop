package music_shop_management;
import behaviours.*;

public class Drum extends Instrument implements Playable, Sellable {

  private String drumHead;

  public Drum(String type, String material, String colour, String drumHead, double buyPrice, double sellPrice) {
    super(type, material, colour, buyPrice, sellPrice);
    this.drumHead = drumHead;
    
  }

}
