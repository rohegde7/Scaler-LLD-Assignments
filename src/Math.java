import java.util.Stack;

public class Math {
// write code for Math class here
public static void main(String args[]){
    Area a = new Area();
//    System.out.println(a.getCircleArea(null));

}

}

class Area {
    double PI = 3.14;

    public double getCircleArea(int radius) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(19);
        stack.pop();

        return (PI * radius * radius);
    }
}