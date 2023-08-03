import java.util.Scanner;

abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract void getProperties(Scanner scanner);
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void name() {
        System.out.println("Shape: " + name );
    }

    public void displayAreaAndPerimeter() {
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

class Square extends Shape {
    private double side;

    public Square() {
        super("Square");
    }

    @Override
    public void getProperties(Scanner scanner) {
        System.out.print("side length: ");
        side = scanner.nextDouble();
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}

class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle() {
        super("Rectangle");
    }

    @Override
    public void getProperties(Scanner scanner) {
        System.out.print("height: ");
        height = scanner.nextDouble();
        System.out.print("width: ");
        width = scanner.nextDouble();
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (height + width);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle() {
        super("Circle");
    }

    @Override
    public void getProperties(Scanner scanner) {
        System.out.print("radius: ");
        radius = scanner.nextDouble();
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select a shape:");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            }

            Shape shape = null;
            switch (choice) {
                case 1:
                    shape = new Square();
                    break;
                case 2:
                    shape = new Rectangle();
                    break;
                case 3:
                    shape = new Circle();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            if (shape != null) {
                System.out.println("Properties: ");
                shape.getProperties(scanner);
                System.out.println();
                shape.name();
                System.out.println();
                shape.displayAreaAndPerimeter();
                System.out.println();
            }
        }
    }
}
