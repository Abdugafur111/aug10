public class CircleGeometricObject extends GeometricObjects{
    private double radius;

    CircleGeometricObject(){
    }

    CircleGeometricObject(double radius){
        this.radius = radius;
    }

    CircleGeometricObject(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;

    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getDiameter(){
        return radius * 2;
    }

}
