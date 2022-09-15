package main;

import domain.Car;
import domain.ProductMap;

public class Main {
    public static void main(String[] args) {
        ProductMap productMap2022 = new ProductMap();

        System.out.println("El autómata se comportará de acuerdo al producto:\n" +
                automataBehaviour(productMap2022, "arona"));

    }

    public static Car automataBehaviour(ProductMap productionMap, String lineName) {
        return productionMap.getProductionMap().get(lineName);
    }
}
