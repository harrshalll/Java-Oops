package com.harshal.practices;

public class PracticeOne {
    public static void main(String[] args) {
        Book HarryPotter1 = new Book();
        Book HarryPotter2 = new Book();

        HarryPotter1.Author = "Harshal Avhad";
        HarryPotter1.title = "Harry Potter";
        HarryPotter1.price = 599;

        HarryPotter2.Author = "Kunal Kushwaha";
        HarryPotter2.title = "Harry Putter";
        HarryPotter2.price = 699;

        System.out.println(HarryPotter1.Author);
        System.out.println(HarryPotter1.title);
        System.out.println(HarryPotter1.price);


        System.out.println(HarryPotter2.Author);
        System.out.println(HarryPotter2.title);
        System.out.println(HarryPotter2.price);

    }
}

class Book{
    String title;
    String Author;
    int price;
}
