package vendingMachine;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String,Integer> stock = new HashMap<>();
    private boolean isAvailable(String productId){
        return stock.getOrDefault(productId, 0) > 0;
    }
    private void reduceStock(String productId){
        stock.put(productId,stock.get(productId)-1);
    }
}
