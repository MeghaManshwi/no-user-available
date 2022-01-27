package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FurnitureOrder implements FurnitureOrderInterface {
    
	HashMap<Furniture, Integer> furnitureOrderMap ;
    FurnitureOrder() {
    	furnitureOrderMap = new HashMap<>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
    	furnitureOrderMap.put(type,furnitureCount+furnitureOrderMap.getOrDefault(type,0));
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        return furnitureOrderMap;
    }
    public float getTotalOrderCost() {
        float totalOrderCost=0.0f;
        for(Entry<Furniture, Integer> entry:furnitureOrderMap.entrySet()){
            totalOrderCost += entry.getKey().cost()* entry.getValue();
        }
        return totalOrderCost;
    }
    public int getTypeCount(Furniture type) {
        return furnitureOrderMap.getOrDefault(type,0);
    }
    public float getTypeCost(Furniture type) {
        return furnitureOrderMap.getOrDefault(type,0)*type.cost();
    }
    public int getTotalOrderQuantity() {
        int totalCount=0;
        for(Map.Entry<Furniture,Integer> entry:furnitureOrderMap.entrySet()){
            totalCount +=entry.getValue();
        }
        return totalCount;
    }
}