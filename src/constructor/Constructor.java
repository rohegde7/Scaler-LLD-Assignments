public class Constructor {
    // write the code of student class here

    int age;
    String name;

    public Constructor() {
        this(0, null);
    }

    public Constructor(String name) {
        this(0, name);
    }

    public Constructor(int age) {
        this(age, null);
    }

    public Constructor(int age, String name) {
        this.age = age;
        this.name = name;

    }
}