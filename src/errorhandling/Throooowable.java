package errorhandling;

public class Throooowable {

    public static void main(String[] args) {
        Parent p = new Child();
        p.print(10);
    }
}

class Something {

    void some() throws Error {

    }

    void some2() throws RuntimeException {

    }
}

class Parent {
    void print(int i) {

    }
}

class Child extends Parent {
    @Override
    void print(int i) throws RuntimeException {
        System.out.println("Hello Childred");
    }
}
