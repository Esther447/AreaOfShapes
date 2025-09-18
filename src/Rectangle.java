class Rectangle extends Shape {
double length;
double width;
double area;

public Rectangle(double length,double width) throws Exception{
    super();

    if(length<0 || width<0){
        throw new Exception("Length or Width area is negative");
    }

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
