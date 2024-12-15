public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);
        Cube cube = new Cube(3);
        Sphere sphere = new Sphere(4);

        System.out.println("Circle: Area = " + circle.getArea() + ", Perimeter = " + circle.getPerimeter());
        System.out.println("Rectangle: Area = " + rectangle.getArea() + ", Perimeter = " + rectangle.getPerimeter());
        System.out.println("Triangle: Area = " + triangle.getArea() + ", Perimeter = " + triangle.getPerimeter());
        System.out.println("Cube: Volume = " + cube.getVolume() + ", Surface Area = " + cube.getSurfaceArea());
        System.out.println("Sphere: Volume = " + sphere.getVolume() + ", Surface Area = " + sphere.getSurfaceArea());

        double convertedArea = GeometryUtils.convertUnits(circle.getArea(), 0.092903); // Example conversion (sq ft to sq m)
        System.out.println("Converted Circle Area to square meters: " + convertedArea);

        System.out.println(GeometryUtils.compareAreas(rectangle.getArea(), circle.getArea()));
    }
}
