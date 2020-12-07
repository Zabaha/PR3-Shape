package Shape;

public class Square extends Rectangle{
    public Square(){
        this.color = "unknown";
        this.filled = false;
        this.width = this.length = 1;
    }

    public Square(double side){
        this.color = "unknown";
        this.filled = false;
        this.width = this.length= side;
    }

    public Square(double side, String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.width = this.length= side;
    }

    public double getSide(){
        return this.width;
    }

    public void setSide(double side){
        this.width = this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public String toString() {
        return "Shape: square, side: " + this.width + ", color: " + this.color;
    }
}
