package com.company;

public class Stem10  extends Root {
    Component1 c1stem10;
    Component2 c2stem10;
    Component3 c3stem10;
    Stem10(double d)
    {
        super(2.78f);
        c1stem10 = new Component1((byte)1);
        c2stem10 = new Component2((short)1);
        c3stem10 = new Component3(1);
        System.out.println("Stem10(double)");
    }
}
