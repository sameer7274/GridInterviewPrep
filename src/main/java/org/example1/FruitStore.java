package org.example1;

import java.util.HashMap;

public class FruitStore {

    private static  FruitStore instance=null;

    private HashMap<String,Integer> fruitMap;

    private  FruitStore() {
        fruitMap=new HashMap<>();
    }

    public static FruitStore getInstance() {
        if(instance==null){
            instance=new FruitStore();
        }
        return instance;
    }
    public void addFruit(String name, int quantity){
        fruitMap.put(name,quantity);
    }
    public int getFruitQuantity(String name){
        return fruitMap.getOrDefault(name,0);

    }
    public void ShowAllFruit(){
        System.out.println("Fruit in store " +fruitMap);
    }
}
