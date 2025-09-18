import java.awt.*;

class Circle extends Shape {
    double radius;
    double pi = Math.PI;

public Circle(double pi,double radius) throws Exception{
    super();

    if (radius < 0) {
        throw new Exception("Radius cannot be negative");
    }
    if (radius > Math.PI) {
        throw new Exception("Radius cannot be greater than phi");
    }

    this.radius=radius;
    this.pi=pi;
}
@Override
    public void display() {
    System.out.println("Circle:" +area);
}

@Override
    public double calculateArea(){
    area = pi *  (radius * radius);
    return area;
}
}