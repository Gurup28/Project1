import java.util.*;

//Write your code here
abstract class Shape {
    abstract public void display();
}
class Circle extends Shape{
    public void display(){
        System.out.println("The shape is a Circle");
    }
}
class Triangle extends Shape {

    public void display() {
        System.out.println("The shape is a triangle");
    }
}

class Rectangle extends Shape {

    public void display() {
        System.out.println("The shape is a rectangle");
    }
}

public class inheritanceShapetest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Shape obj = new Circle();
        Shape obj1 = new Triangle();
        Shape obj2 = new Rectangle();
        int numberOfSides = in.nextInt();
        if(numberOfSides == 0) {
            obj.display();
        }
        else if(numberOfSides == 3) {
            obj1.display();
        }
        else if(numberOfSides == 4) {
            obj1.display();
        }
        else
            System.out.println("Enter a valid number of sides!");
        in.close();
    }
}

