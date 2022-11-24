/**
 * super class
 */
public class Shape {
    private double width;
    private double height;
    Shape(double w , double h){
        width=w;
        height=h;
    }
    double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }
    public void setWidth(double w){
        width = w;
    }
    public void setHeight(double h){
        height = h;
    }
    public void showWH(){
        System.out.println("Width = " + width + " " + "Height = " + height);
    }
}
