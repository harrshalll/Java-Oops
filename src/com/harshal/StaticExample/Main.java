package com.harshal.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human Harshal = new Human(23,"Harshal Avhad",1000000,false);
        Human Kunal = new Human(25,"Kunal Kushwaha",2000000,true );
        Human Arpit = new Human(25,"Arpit",2000000,true );

        System.out.println(Human.population);
        // you can use like kunal.population to access the static variable by this method also like I do below
        // but that is not the better convention.

        //Accessing static through instances not preferred but works
//        System.out.println(Kunal.population);
//        System.out.println(Harshal.population);
//        System.out.println(Arpit.population);

        // how can above convention works? ---> because compiler first check does the object have the property if it's not
        // it directed to the class check there. if it is there then it will print.

//         greeting(); you can not access non-static member inside static field because it requires an instances/objects.

        // here is how can you access non-static inside static
        Main obj = new Main();// you can create object of that same class inside that class if it is inside any method
        obj.greeting();
    }

    static void fun(){
        //greeting(); you cannot access non-static inside static because it requires instances but the function you are
                    // using in it does not depend on instances
        Main obj1 = new Main();
        obj1.greeting();// now you can use non-static inside static with the help of instances/objects.
    }
    // we know that something which is not static belongs to an object
    void greeting(){
        System.out.println("Hello!");
        fun();// Here you can see we can use static inside non-static
    }
}
// You cannot use non-static inside  without creating an object and accessing via object, but you can use static inside
// non-static because it doesn't depend on objects