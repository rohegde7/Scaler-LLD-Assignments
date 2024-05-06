public class Student {
    int age;
    String name;

    private void display() {
        System.out.println("My name is " + name + ". I am " + age + " years old");
    }

    private void sayHello(String name) {
        System.out.println(this.name + " says hello to " + name);
    }
}

class Rectangle {
    Point topLeft;
    int height;
    int width;

    int getArea() {
        return width * height;
    }

    int getPerimeter() {
        return 2 * (width + height);
    }

    Point getBottomRight() {
        Point bottomRight = new Point();
        bottomRight.x = topLeft.x + width;
        bottomRight.y = topLeft.y - height;

        return bottomRight;
    }
}

class Point {
    int x;
    int y;
}