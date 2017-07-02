package music_shop_management;
import behaviours.*;

public class Drum extends Instrument implements Playable, Sellable {

  private int drumHead;

  public Drum(String type, String material, String colour, int drumHead, double buyPrice, double sellPrice) {
    super(type, material, colour, buyPrice, sellPrice);
    this.drumHead = drumHead;
    
  }

  public String getType() {
    return this.type;
  }

}
