package com.company;

public class Root {

    Component1 c1root;
    Component2 c2root;
    Component3 c3root;
    Root(float f)
    {
        c1root = new Component1((byte)0);
        c2root = new Component2((short)0);
        c3root = new Component3(0);
        System.out.println("Root(foat)");
    }
}
