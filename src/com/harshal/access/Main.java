package com.harshal.access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(1,"Harshal",54);

        obj.getNum();

    }
}
/*
Access Modifier:---->
1.  private --> We can't access anything directly which is declared as private.
    for access, we need to use getter and setter.
2.  public --> we can access anything directly which is declared as public.
    we declare name as public and call it in another package. here, we used public variable in package named encapsulation. we always have to import the package for
    accessing the public variable.
3.  protected --> We can access anything which declared as protected in same class, same package, subclass of that superclass
    in same package and subclass of that superclass in different package like we do with int n1 variable in demo package inside class name
    subclass.
4.  default --> We can access anything which is declared default in same class, same package and same subclass of superclass within same package.

 */