package com.nearsoft.constructors;

// Demonstrate when constructors are executed.
// Create a super class.
class A {
    A() {
        System.out.println("Inside A's constructor.");
    }
}

// Create a subclass by extending class A.
class B extends A {
    B() {
        System.out.println("Inside B's constructor.");
    }
}

// Create another subclass by extending B.
class C extends B {
    C() {
        System.out.println("Inside C's constructor.");
    }
}

public class CallingCons {
    public static void main(String[] args) {
        C c = new C();
    }
}



// Demonstrate when constructors are executed.
// Create a super class.
class A2 {
    A2(int i) {
        System.out.println("Inside A's constructor.");
    }
}

// Create a subclass by extending class A.
class B2 extends A2 {
    B2(int i) {
        super(i);
        System.out.println("Inside B's constructor.");
    }
}

// Create another subclass by extending B.
class C2 extends B2 {
    C2(int i) {
        super(i);
        System.out.println("Inside C's constructor.");
    }
}

class CallingCons2 {
    public static void main(String[] args) {
        C2 c2 = new C2(10);
    }
}