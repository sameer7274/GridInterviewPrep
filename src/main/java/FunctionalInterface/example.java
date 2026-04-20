package FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class example {
    public static void main(String[] args) {


        //  Predicate<T> : - Represents a boolean-valued function of one argument.
        Predicate<String> isLongerthan5=str->str.length()>5;
        System.out.println(isLongerthan5.test("hello"));
        System.out.println(isLongerthan5.test("sameerRaj"));

        //Function<T,V> Represents a function that accepts one argument and produces a result.
        Function<String,Integer> strlength=str->str.length();
        System.out.println(strlength.apply("sameer"));
        System.out.println(strlength.apply("Raj"));

        // Represents an operation that accepts a single input argument and returns no result.
        Consumer<String> print=str-> System.out.println(str);
        print.accept("sameer raj");

        //  Represents a supplier of results.
        Supplier<String> supp=()->"sameer raj";
        System.out.println( supp.get());
        display();


        String a="sameer";
        String b="raj";

        a=a+b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("After Swap "+ a +" " +" B "+ b);
        System.out.println("");
    }
    static void display(){
        System.out.println("Hello");




    }
}
