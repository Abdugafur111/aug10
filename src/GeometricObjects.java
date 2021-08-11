public class GeometricObjects {
    private String color;
    private boolean filled;
    private java.util.Date createdDate;

    GeometricObjects(){
        createdDate = new java.util.Date();
        color = "black";
    }

    GeometricObjects(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public java.util.Date getCreatedDate(){
        return createdDate;
    }

    public String toString(){
        return "created on" + createdDate + " color is " + color;
    }


}
