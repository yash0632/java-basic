public class Test {
    public static void main(String[] args){
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        //t1.print();
        MyThread t2 = new MyThread(counter);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){

        }
        System.out.println(counter.getCount());
    }

}
