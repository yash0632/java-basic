public class Interrupt {
    public static void main(String[] args) throws InterruptedException {
        //Case 1 -> Interrupted While thread is Sleeping
        MyThread2 t1 = new MyThread2();
        t1.start();

        Thread.sleep(2000);
        t1.interrupt();


    }
}

class MyThread2 extends Thread {
    @Override
    public void run(){
        while(!Thread.currentThread().isInterrupted()){
            try{
                System.out.println("MyThread is Running....");
                System.out.println("Interrupt status: " + isInterrupted());
                System.out.println("Thread Interrupted: " + Thread.interrupted());
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("MyThread is interrupted");
                System.out.println("Interrupt status after exception: " + isInterrupted());
                Thread.currentThread().interrupt();
                //System.out.println("Thread Interrupted: " + Thread.interrupted());


            }
        }
        System.out.println("Thread is ending");
    }
}

//interrupt -> interrupts the thread and throws InterruptedException if thread is sleeping
//isInterrupted -> false if thread is not interrupted otherwise yes
//Thread.interrupted -> true if thread is interrupted and resets flag