package music_shop_management;
import behaviours.*;
import java.util.*;

public class Shop {
  private String name;
  private ArrayList<Sellable> stock;

  public Shop(String name) {
    this.name = name;
    this.stock = new ArrayList<Sellable>();
  }

  public String getName() {
    return this.name;
  }

  public void addStock(Sellable stockItem) {
    stock.add(stockItem);
  }

  public void removeStock(Sellable stockItem) {
    stock.remove(stockItem);
  }

  public int countStock() {
    return stock.size();
  }

  public double getTotalPotentialProfit() {
    double totalMarkUp = 0;
    for(Sellable stockItem : stock) {
      totalMarkUp += stockItem.calculateMarkUp();
    }
      return totalMarkUp;
    }

}