public class Box {
    public double width,height,depth;
    Box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    public String toString(){
        return "Dimension are "+width+" by "+depth+" by "+height+".";
    }
}
