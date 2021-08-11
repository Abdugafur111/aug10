public class RectangleGeometricObject extends GeometricObjects{
    private double width;
    private double height;

    RectangleGeometricObject(){
    }

    RectangleGeometricObject( double width, double height){
        this.height = height;
        this.width = width;
    }

    RectangleGeometricObject(double width, double height, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.height = height;

    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getPerimeter(){
        return (width+height)*2;
    }

    public double getArea(){
        return height * width;
    }


}
