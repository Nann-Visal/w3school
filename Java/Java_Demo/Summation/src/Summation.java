public class Summation {
    public static void main(String[] args){
        Sum obj1 = new Sum(12);
        Sum obj2 = new Sum(obj1);
        System.out.println("Obj1= "+ obj1.sum);
        System.out.println("Obj2= "+ obj2.sum);
    }
}
