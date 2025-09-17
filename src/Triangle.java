class  Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base, double height){
        super();
        this.base=base;
        this.height=height;
    }

    public void display(){
        System.out.println("Triangle:" +base);
    }

    @Override
    public double calculateArea(){
        double area = base * height;
        return area;
    }
}