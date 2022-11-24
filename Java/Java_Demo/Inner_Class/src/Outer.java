public class Outer {
    int nums[];
    Outer(int n[]){
            nums=n;
    }
    void analy(){
        //make obj for inner class
        inner_class inobj = new inner_class();
        System.out.println("Min: "+inobj.min());
        System.out.println("Max: "+inobj.max());
        System.out.println("Avg: "+inobj.avg());
    }
    class inner_class{
        int min(){
            int m=nums[0];
            for(int i=1 ; i< nums.length ; ++i){
                if(nums[i]<m){
                    m=nums[i];

                }
            }
            return m;
        }
        int max(){
            int m=nums[0];
            for(int i=1 ; i<nums.length ; i++){
                if(nums[i]>m){
                    m=nums[i];
                }
            }
            return m;
        }
        int avg(){
            int s=0;
            for(int i=1 ; i<nums.length ; ++i){
                s+=nums[i];
            }
            return s/nums.length;
        }
    }
}
