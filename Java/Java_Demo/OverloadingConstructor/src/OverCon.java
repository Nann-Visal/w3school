public class OverCon {
    public int x;
    OverCon(){
        x=0;
    }
    OverCon(int i){
        x=i;
    }
    OverCon(double d){
        x=(int)d;
    }
    OverCon(int i , double d){
        x=i+(int)d;
    }
    void prnt(){
        System.out.println("The value of x= "+x);
    }
}
