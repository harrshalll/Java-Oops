package com.harshal.introduction;

class Animals{
    int legs;
//    Animals() {
//        Practice math = new Practice();
//        Practice.math.nothing;
//    }
    void anything(){
        System.out.println(Practice.lion.legs);
    }
}

public class Practice {
    int nothing;
    public static Animals lion = new Animals();
    public static void main(String[] args) {
        lion.legs = 4;
        System.out.println(lion.legs);

    }
}
class Human{
    int legs;
    int hands;
    int nose;
    int eyes;

}
