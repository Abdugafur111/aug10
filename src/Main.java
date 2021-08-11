public class Main {

    public static void main(String[] args) {
	// write your code here
        CircleGeometricObject circle = new CircleGeometricObject(10);
        System.out.println(circle.toString());
        System.out.println("radius is " + circle.getRadius());
        System.out.println("area is " + circle.getArea());
        System.out.println("perimeter is " + circle.getDiameter());

        RectangleGeometricObject rectangle = new RectangleGeometricObject(3,5);
        System.out.println(rectangle.toString());
        System.out.println("width is "  + rectangle.getWidth());
        System.out.println("height is " + rectangle.getHeight());
        System.out.println("area is " + rectangle.getArea());
        System.out.println("perimeter is " + rectangle.getPerimeter());
    }
}
