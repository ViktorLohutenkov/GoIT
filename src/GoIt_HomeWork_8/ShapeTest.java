package GoIt_HomeWork_8;

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