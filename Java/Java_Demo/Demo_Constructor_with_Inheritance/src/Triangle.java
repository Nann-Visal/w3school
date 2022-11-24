/**
 * sub class
 */
public class Triangle extends Shape {
    private String style;
    // Constructor
    Triangle (String s , double w , double h){
        super(w,h);
        style = s;
    }
    double area(){
        return (getWidth()*getHeight())/2;
    }
    void showStyle(){
        System.out.println("the style of triangle is " + style);
    }
}
