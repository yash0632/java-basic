import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " is trying to withdraw " + amount);

        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){

            }

        }catch(Exception e){
            System.out.println(e);
        }





        if(balance >= amount){

            System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
            try{
                Thread.sleep(10000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            this.balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed Withdrawal. Remaining Balance is " + this.balance);

        }else{
            System.out.println(Thread.currentThread().getName() + " Not enough money");
        }
    }
}
