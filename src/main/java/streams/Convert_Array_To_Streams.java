package streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Convert_Array_To_Streams {
    public static void main(String[] args) {
        //primitive Type Array
        int[] arr={1,2,3,4,5};
       IntStream streamobj= Arrays.stream(arr);
       streamobj.forEach(System.out::println);
      //Object Type array
       Integer[] arrayInteger={7,8,9};
       Stream<Integer> objStream=Stream.of(arrayInteger);
       objStream.forEach(System.out::println);
    }
}
