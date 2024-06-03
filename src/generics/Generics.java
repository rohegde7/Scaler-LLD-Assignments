package generics;

public class Generics {

    public static void main(String[] args) {
//        Animal a = new Dog();
//        Dog d = new Animal();

        GenericExamples ge = new GenericExamples();
        System.out.println(ge.whatDoYouWant(new Integer(10)));
    }
}

class GenericExamples<T> {

    T whatDoYouWant(T param) {
        return param;
    }
}

class Animal {

}

class Dog extends Animal {

}
