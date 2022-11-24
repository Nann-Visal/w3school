public class Outer {
    int outer_x=100;
    void test(){
        for(int i=0 ; i<10 ; ++i){
            class inner{
                void display(){
                    System.out.println("display_x= "+ outer_x);
                }
            }
            inner inobj = new inner();
            inobj.display();
        }
    }
}
