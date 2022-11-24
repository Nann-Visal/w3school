public class DemoCon_with_Paramet {
    public static void main(String[] args){
        Con_Para obj1 = new Con_Para(1,0);
        Con_Para obj2 = new Con_Para(8,9);
        System.out.println("obj1: x and y");
        System.out.println("x = "+ obj1.x);
        System.out.println("y = "+ obj1.y);
        System.out.println("x*y = "+ obj1.mul());
        obj2.x=12;
        obj2.y=4;
        System.out.println("obj2: x and y");
        System.out.println("x = "+ obj2.x);
        System.out.println("y = "+ obj2.y);
        System.out.println("x*y = "+ obj2.mul());
    }
}
