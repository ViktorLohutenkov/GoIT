abstract class Shape{
    public abstract String getName();

}
class Circle extends Shape{
    @Override
    public String getName() {
        return "Circle";

    }
}

class Quad extends Shape{
    @Override
    public String getName() {
        return "Quad";

    }
}

class Triangle extends Shape{
    @Override
    public String getName() {
        return "Triangle";

    }
}

class Star extends Shape {
    @Override
    public String getName() {
        return "Star";

    }
}

class Pentagon extends Shape{
    @Override
    public String getName() {
        return "Pentagon";
    }
}
class ShapeTest {
    public String test(Shape shape){
        return shape.getName();
    }
    public static void main(String[] args) {


    ShapeTest shapeTest = new ShapeTest();
        System.out.println(shapeTest.test(new Circle()));
        System.out.println(shapeTest.test(new Quad()));
        System.out.println(shapeTest.test(new Triangle()));
        System.out.println(shapeTest.test(new Star()));
        System.out.println(shapeTest.test(new Pentagon()));

    }
}