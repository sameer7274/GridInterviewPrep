package streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Map_vs_FlatMap {
    public static void main(String[] args) {

        List<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(6);
    /*
        Map ek value ko dusri value me convert karta hai
        Map-one to one Mapping
     */
        int sumofSquare=numbers.stream()
                .filter(n->n%2==0)
                .mapToInt(n->n*n)
                .sum();
        System.out.println("Sum of Sqaures "+ sumofSquare);

        //-----------FlatMap--------------
        /*
           FlatMap nested structure ko flatten karta hai
           List ke andar List ho
           Optional ke andar Optional
           Stream me andar Stream


         */

        List<List<String>> list=List.of(List.of("A","B"),List.of("C","D"));
               list.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
