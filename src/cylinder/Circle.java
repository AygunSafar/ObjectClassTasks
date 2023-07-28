package cylinder;

public class Circle {

    private double radius;

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius<0 ? 0: radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
}
