public class Sum {
    public int sum;
    public Sum(int num){
        sum=0;
        for(int i=0 ; i<=num ; ++i){
            sum+=i;
        }
    }
    public Sum(Sum obj){
        sum=obj.sum;
    }
}
