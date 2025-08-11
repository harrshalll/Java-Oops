package com.harshal.StaticExample;

public class InnerClasses {//Outside Classes cannot be static because itself cannot dependent on class.

    static class Test {//static used here because inner class doesn't have to depend on object of outer class to run
        // static used here because the inner class does not need to access instance members of the outer class.
        // This means static here  allows us to create the inner class objects without creating an object of the outer class.

        String name;
        public Test(String name) {
            this.name = name;
        }


        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");

       // System.out.println(a);println calls toString() method internally. compiler first checks does a has toString()--it will not
        // then go to Test class and check whether it has toString()--> it has not. then it will call the default toString()
        // which is inside the java and gives random hash value
        System.out.println(a);
//        System.out.println(a.name);
//        System.out.println(b.name);
    }
}

