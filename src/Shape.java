//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Shape {
    double pi1=3.14;
    double rad;
    double area;
    double TriangleArea;
    double RectangleArea;

    public Shape(){

    }

    public void display(){
        System.out.println("Area of circle is: "+area);
        System.out.println("Area of Triangle is: "+TriangleArea);
        System.out.println("Area of Rectangle is: "+RectangleArea);
    }
    public double calculateArea(){
        return area;
    }

    public static void main(String[] args) {
        try {
            Circle circle = new Circle(3.14, 2);
            circle.calculateArea();
            circle.display();

            Rectangle rectangle = new Rectangle(12, 6);
            rectangle.calculateArea();
            rectangle.display();

            Triangle triangle = new Triangle(7, 3);
            triangle.calculateArea();
            triangle.display();

            Circle invalidCircle = new Circle(3.14, -5);
            invalidCircle.calculateArea();
            invalidCircle.display();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}