public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(3, 4);
        System.out.println("Үч бурчтуктун аянты: " + triangle.findArea());

        Rectangle rectangle = new Rectangle(5, 7);
        System.out.println("Төрт бурчтуктун аянты: " + rectangle.findArea());

        Circle circle = new Circle(2);
        System.out.println("Айлананын аянты: " + circle.findArea());

        Square square = new Square(6);
        System.out.println("Аянттын аянты: " + square.findArea());


    }
}