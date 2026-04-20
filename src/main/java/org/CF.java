package org;

import java.util.concurrent.CompletableFuture;

public class CF {
    public static void main(String[] args) throws Exception {

//        CompletableFuture<String> greet=CompletableFuture.supplyAsync(()->
//        {
//           return "Hello from CompletableFuture";
//        });

        // ######## Composing Completable Future #####
        CompletableFuture<String> hello=CompletableFuture.supplyAsync(()->"hello");
        CompletableFuture<String> world=CompletableFuture.supplyAsync(()->"World");
        // here this creates two instance of completableFuture

        CompletableFuture<String> combined=hello.thenCombine(hello,(m1,m2)->m1+ " "+m2);
        //using thenCombine ,the result of both the completable future are concatenated and return as final result.

        System.out.println(combined.get());

        CompletableFuture<Integer> f1=CompletableFuture.supplyAsync(()->10);
        CompletableFuture<Integer> f2=CompletableFuture.supplyAsync(()->20);

        // Running multiple task in parallel
        CompletableFuture<Void> all=CompletableFuture.allOf(f1,f2);
        all.join();
        System.out.println("Future 1 "+ f1.get());
        System.out.println("Future 2" + f2.get());



    }
}
