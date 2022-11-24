public class DemoArrayFisrsValue {
    public static void main(String[] args){
        int day_in_month[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=0 ; i<12 ; i++){
            System.out.println("Month: " + (i+1) + "has: " + day_in_month[i]);
        }
    }
}
