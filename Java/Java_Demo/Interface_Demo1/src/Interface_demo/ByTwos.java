package Interface_demo;

public class ByTwos implements Series{
    int start;
    int val;
    ByTwos(){
        start=0;
        val=0;
    }

    @Override
    public int getNext() {
        val+=2;
        return val;
    }

    @Override
    public void reset() {
        start=0;
        val=0;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}
