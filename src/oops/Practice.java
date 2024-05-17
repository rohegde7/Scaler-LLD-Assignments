package oops;

public class Practice {
    public static void main(String[] args) {
//            A a = new B();
//            System.out.println(a.age);
//            a.printSomething();
//            a.printName();
//            System.out.println(a.name);
//            a.printName();
//            A.printClassName();
//            a.printClassName();

//            A a = new A();
//            B b = (B)a;
//            System.out.println(b.name);
//            System.out.println(b.age);
//            b.printName();
//            b.printSomething();
//            B.printClassName();

        A a = new A();
        a.printClassName();
    }
}

class A {
    int age = 1;
    String name = "A";

    void printName() {
        System.out.println(name);
    }

    void printSomething() {
        System.out.println("Hello" + age);
    }

    static protected void printClassName() {
        System.out.println("Class: A");
    }

    static protected void printClassName(String a) {

    }

    static protected void printClassName(int a) {

    }
}

class B extends A {
    int age = 2;
    String name = "B";

    void printName() {
        System.out.println(name);
    }

    void printSomething() {
        System.out.println("Bye Bye " + age);
    }

    static protected void printClassName() {
        System.out.println("Class: B");
    }
}
