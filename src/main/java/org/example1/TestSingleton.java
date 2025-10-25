package org.example1;

public class TestSingleton {
    public static void main(String[] args) {
        FruitStore s1=FruitStore.getInstance();
        s1.addFruit("Apple",10);
        s1.addFruit("Banana",5);

        FruitStore s2=FruitStore.getInstance();
        s2.addFruit("Cherry",8);

        s1.ShowAllFruit();
        s2.ShowAllFruit();

        System.out.println(s1==s2);
    }
}
