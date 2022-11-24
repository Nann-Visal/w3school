public class B extends A {
    int i;
    B(int a , int b){
        super.i=a; //show i is  member's superclass
        i=b;//show i is member's subclass
    }
    void show(){
        System.out.println(" i in super class is "+ super.i);
        System.out.println(" i in sub class is "+ i);
    }
}
