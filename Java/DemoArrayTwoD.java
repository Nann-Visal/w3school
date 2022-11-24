public class DemoArrayTwoD {
    public static void main(String[] args){
        int myTwoArray[][] = new int[4][5];
        int i,j,k=1;
        for(i=0;i<4;i++){
            for(j=0;j<5;j++){
                myTwoArray[i][j] = (i+j)*k;
                k++;
            }
        }
        for(i=0;i<4;i++){
            for(j=0;j<5;j++){
               System.out.print(" "  + myTwoArray[i][j] );
            }
            System.out.println(" ");
        }
    }
}
