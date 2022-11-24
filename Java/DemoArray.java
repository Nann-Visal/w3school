public class DemoArray {
    public static void main(String [] args){
        int day_in_month[] = new int[12];
        day_in_month[0]=31;
        day_in_month[1]=28;
        day_in_month[2]=31;
        day_in_month[3]=30;
        day_in_month[4]=31;
        day_in_month[5]=30;
        day_in_month[6]=31;
        day_in_month[7]=31;
        day_in_month[8]=30;
        day_in_month[9]=31;
        day_in_month[10]=30;
        day_in_month[11]=31;
        for(int i =0 ; i<12 ;i++){
            System.out.println("Day In Month = " + day_in_month[i]);
        }
    }
}
