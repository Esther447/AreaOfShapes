class Rectangle extends Shape {
double length;
double width;
double area;

public Rectangle(double length,double width){
    super();
    this.length=length;
    this.width=width;
}
 public void display() {
    System.out.println("Rectangle:" +area);
 }
 public double calculateArea(){
   area = length * width;
   return area;
 }
}
