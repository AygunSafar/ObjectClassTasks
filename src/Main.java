import carpetCostCalculator.Calculator;
import carpetCostCalculator.Carpet;
import carpetCostCalculator.Floor;
import cylinder.Circle;
import cylinder.Cylinder;
import person.Person;
import point.Point;
import poolArea.Cuboid;
import poolArea.Rectangle;
import sumCalculator.SimpleCalculator;
import wallArea.Wall;

public class Main {
    public static void main(String[] args) {

        //Pool Area Test Code
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

        System.out.println("*****************************************************************");

        //Cylinder Test Code

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        System.out.println("*****************************************************************");

        // Carpet Cost Calculator Test Code

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

        System.out.println("*****************************************************************");

        //Point Test Code
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());


        System.out.println("*****************************************************************");

//      Wall Test Code
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

        System.out.println("*****************************************************************");

        //Person test Code

        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());


        System.out.println("*****************************************************************");

        // Calculator Test Code

        SimpleCalculator calculator1 = new SimpleCalculator();
        calculator1.setFirstNumber(5.0);
        calculator1.setSecondNumber(4);
        System.out.println("add= " + calculator1.getAdditionResult());
        System.out.println("subtract= " + calculator1.getSubtractionResult());
        calculator1.setFirstNumber(5.25);
        calculator1.setSecondNumber(0);
        System.out.println("multiply= " + calculator1.getMultiplicationResult());
        System.out.println("divide= " + calculator1.getDivisionResult());

    }
}