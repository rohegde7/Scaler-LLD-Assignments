public class PassByValueTest {
    int age;
    String name;

    void display(){
        System.out.println("My name is " + this.name + ". I am "  + this.age + " years old");
    }

    void sayHello(String name){
        System.out.println(this.name + " says hello to " + name);
    }
}

class Client {
    public static void main(String[] args) {
        PassByValueTest s1 = new PassByValueTest();
        s1.age = 10;
        s1.name = "A";

        PassByValueTest s2 = new PassByValueTest();
        s2.age = 20;
        s2.name = "B";

        swap(s1, s2);

        s1.display();
    }

    private static void swap(PassByValueTest s1, PassByValueTest s2) {
        PassByValueTest temp = s1;
        s1 = s2;
        s2 = temp;
    }
}