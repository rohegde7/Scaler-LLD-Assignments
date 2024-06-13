package Interfaces;

public interface ParentInterface {

     void fly();
}

interface ChildInterface extends ParentInterface {
    @Override
    default void fly(){

    }
}

class Imple implements  ChildInterface {
    @Override
    public void fly() {
        System.out.println("Overridden in class implementation");
    }
}
