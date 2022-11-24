//sub class
public class Traingle extends Shape {
    String style;

    /**
     *
     * @return
     */
    double area(){
        return (width*height)/2;
    }

    /**
     *
     */
    void showStyle(){
        System.out.println("The style of Traingle is " + style);
    }
}
