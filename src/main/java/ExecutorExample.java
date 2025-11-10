import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
      //  ExecutorService executorService= Executors.newFixedThreadPool(3);


        ExecutorService executorService=Executors.newFixedThreadPool(3);

        for(int i=1;i<=5;i++){
            int tasked = i;

            executorService.submit(()-> {
                System.out.println("Task  " + tasked + "running on thread " + Thread.currentThread().getName());


                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();


                }
            });
        }
        executorService.shutdown();
    }
}
