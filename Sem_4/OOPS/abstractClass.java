package OOPS;
abstract class Shape{
    abstract double perimeter();
    abstract double area();
}

class Circle extends Shape{
    double radius;
    Circle(double s2){
        this.radius = s2;
    }
    double perimeter(){
        return 2*Math.PI*radius;
    }
    double area(){
        return Math.PI*radius*radius;
    }

    public static void main(String args[]){
        Shape s1 = new Circle(5);
        System.out.println("Perimeter of circle: "+s1.perimeter());
        System.out.println("Area of circle: "+s1.area());
        Shape s2 = new Rectangle(5, 6);
        System.out.println("Perimeter of rectangle: "+s2.perimeter());
        System.out.println("Area of rectangle: "+s2.area());
    }
}

class Rectangle extends Shape{
    double length;
    double breadth;
    Rectangle(double l, double b){
        this.length = l;
        this.breadth = b;
    }
    double perimeter(){
        return 2*(length+breadth);
    }
    double area(){
        return length*breadth;
    }
}
