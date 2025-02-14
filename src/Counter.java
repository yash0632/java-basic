public class Counter {
    private int count = 0;

    public void increment(){
        synchronized (this){
            count++;
        }

    }

    public int getCount(){
        return count;
    }
}
//Mutual exclusion -> multiple threads can not get access to code at same time
//Locks