package org.example;

public class Outer {
    private int outerValue = 10;

    private void hello(){
        System.out.println("outer hello world");
    }

    public void method() {
        final int methodLocalValue = 20;

        class Inner {
            public void printValues() {
                // OK: Inner class hold the reference of outer class
                System.out.println("Outer value: " + outerValue);
                // compile error, methodLocalValue should be final
                System.out.println("Final outer value: " + methodLocalValue);
                hello();
            }
        }

        Inner inner = new Inner();
        inner.printValues();
    }

    public static void main(String[] args) {
        new Outer().method();
    }
}
