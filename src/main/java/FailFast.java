import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFast {

    public static void main(String[] args) {
      // Object lock=new Object();
       // ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3));
        /* List<Integer> numbers = new CopyOnWriteArrayList<>(Arrays.asList(1, 2, 3));

        Iterator<Integer> iterator = numbers.iterator();


        while (iterator.hasNext()) {
            Integer num = iterator.next();
           // synchronized (lock){
            numbers.add(4);
            // System.out.println(num);;*/

        /*
        fail fast(like arrayList,HashMap) modification during iteration throw concurrentModificationException
        fail safe(like COpyonWriteArrayList,ConcurrentHashMap)

         */

        String a="sameer";
        String b="sameer";
         b="sjjjj";
        System.out.println(b);
        }
        //System.out.println(numbers);
    }

