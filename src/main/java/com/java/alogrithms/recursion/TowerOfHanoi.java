package com.java.alogrithms.recursion;

public class TowerOfHanoi {

    public static void main(String[] args) {

        towerOfHanoi(4, "A", "B", "C");
    }

    static void towerOfHanoi(int n, String from_tower, String auxilary_tower, String to_tower) {

        if (n > 0) {
            //moving n-1 from from tower to auxilary tower
            towerOfHanoi(n-1, from_tower, to_tower,auxilary_tower);
            //moving remaining 1 from from tower to to tower
            System.out.println("Move 1 from "+from_tower +" to "+to_tower);
            //moving n-1 from auxilary tower to to tower
            towerOfHanoi(n-1, auxilary_tower, from_tower, to_tower);
        }

    }

}
