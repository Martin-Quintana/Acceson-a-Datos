package domain;

import java.util.HashMap;
import java.util.Map;

public class ProductMap {
    private Map<String, Car> productionMap = new HashMap<>();

    public ProductMap() {
        productionMap.put("ibiza", new Car("Seat", "Ibiza", "rojo", 2022));
        productionMap.put("arona", new Car("Seat", "Arona", "negro", 2019));
        productionMap.put("leon", new Car("Seat", "León", "rojo", 2020));
        productionMap.put("ateca", new Car("Seat", "Ateca", "verde", 2022));
        productionMap.put("tarraco", new Car("Seat", "Tarraco", "gris", 2021));
    }

    public Map<String, Car> getProductionMap() {
        return productionMap;
    }
}
